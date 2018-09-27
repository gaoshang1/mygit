package com.northdoo.futian_ducha.wps.service;


import android.os.RemoteException;
import android.util.Log;

import com.northdoo.futian_ducha.wps.utils.Define;
import com.northdoo.futian_ducha.wps.utils.EncryptClass;
import com.northdoo.futian_ducha.wps.utils.SettingPreference;

import cn.wps.moffice.client.ActionType;
import cn.wps.moffice.client.AllowChangeCallBack;
import cn.wps.moffice.client.OfficeEventListener;
import cn.wps.moffice.client.OfficeInputStream;
import cn.wps.moffice.client.OfficeOutputStream;
import cn.wps.moffice.client.ViewType;

public class OfficeEventListenerImpl extends OfficeEventListener.Stub
{
    protected MOfficeClientService service = null;

    private boolean mIsValidPackage = true;

    public OfficeEventListenerImpl(MOfficeClientService service)
    {
        this.service = service;
    }

    @Override
    public int onOpenFile(String path, OfficeOutputStream output)
            throws RemoteException
    {
        Log.d("OfficeEventListener", "onOpenFile");

        if (!mIsValidPackage)
            return -1;

        SettingPreference settingPreference;
        settingPreference = new SettingPreference(this.service.getApplicationContext());
        boolean isEncrypt = settingPreference.getSettingParam(Define.ENCRYPT_FILE, false);

        if (isEncrypt)
            return EncryptClass.encryptOpenFile(path, output);
        else
            return EncryptClass.normalOpenFile(path, output);

    }

    public int onGetFileStream(String path, OfficeOutputStream output) throws RemoteException
    {
        return EncryptClass.encryptOpenFile(path, output);
    }

    @Override
    public int onSaveFile(OfficeInputStream input, String path) throws RemoteException
    {
        Log.d("OfficeEventListener", "onSaveFile");

        SettingPreference settingPreference;
        settingPreference = new SettingPreference(this.service.getApplicationContext());
        boolean isEncrypt = settingPreference.getSettingParam(Define.ENCRYPT_FILE, false);

        if (isEncrypt)
        {
            Log.d("OfficeEventListener", "encryptSaveFile");
            return EncryptClass.encryptSaveFile(input, path);
        } else
        {
            Log.d("OfficeEventListener", "encryptSaveFile");
            return EncryptClass.normalSaveFile(input, path);
        }
    }

    @Override
    public int onCloseFile() throws RemoteException
    {
        Log.d("OfficeEventListener", "onCloseFile");
        return 0;
    }

    @Override
    public boolean isActionAllowed(String path, ActionType type) throws RemoteException
    {
        Log.d("OfficeEventListener", "isActionAllowed" + type.toString());

        SettingPreference settingPreference;
        settingPreference = new SettingPreference(this.service.getApplicationContext());

        //光标输入模式，进行特殊处理
        if (type.equals(ActionType.AT_CURSOR_MODEL)
                && settingPreference.getSettingParam(type.toString(), true))
        {
            return isCursorMode(path, type);
        }

        if (type.equals(ActionType.AT_EDIT_REVISION))    //如果是接受或拒绝某条修订的事件,做特殊处理
        {
            return isRevisionMode(path, type, settingPreference);
        }

        boolean typeAT = settingPreference.getSettingParam(type.toString(), true);
        String pathAT = settingPreference.getSettingParam(Define.AT_PATH, "/");
        boolean isExist = path.startsWith(pathAT) || path.equals("");  //有部分事件传过来路径为"",
        if (!typeAT && isExist)
            return false;

        return true;
    }

    //是否可以操作他人修订（作者名不同的修订）
    private boolean isRevisionMode(String path, ActionType type, SettingPreference settingPreference)
    {
        String docUserName = settingPreference.getSettingParam(Define.USER_NAME, "");
        boolean typeAT = settingPreference.getSettingParam(type.toString(), true);
        boolean isSameOne = docUserName.equals(path);    //在此事件中，path中存放是是作者批注名
        if (!typeAT && !isSameOne)
        {
            return false;
        }

        return true;
    }

    //中广核特殊需求
    private boolean isCursorMode(String path, ActionType type) throws RemoteException
    {

        boolean flag = null != FloatServiceTest.getDocument() && FloatServiceTest.getDocument().getSelection().getStart() == FloatServiceTest.getDocument().getSelection().getEnd();

        if (!flag)
            return false;

        if (FloatServiceTest.getDocument().isProtectOn())
            return false;

        FloatServiceTest.getDocument().getSelection().getFont().setBold(true);
        FloatServiceTest.getDocument().getSelection().getFont().setItalic(true);
        FloatServiceTest.getDocument().getSelection().getFont().setName("宋体");
        FloatServiceTest.getDocument().getSelection().getFont().setStrikeThrough();
        FloatServiceTest.getDocument().getSelection().getFont().setSize((float) 15.0);
        FloatServiceTest.getDocument().getSelection().getFont().setTextColor(0x00ff00);

        return true;
    }

    /**
     * 实现多个可变包名的验证
     * originalPackage是最原始的第三方包名，华为渠道为“com.huawei.svn.hiwork”
     * thirdPackage为可变动的应用包名，具体有企业资金定制
     */
    @Override
    public boolean isValidPackage(String originalPackage, String thirdPackage)
            throws RemoteException
    {
//此处是某些企业的特殊需求，可以忽略
//		mIsValidPackage = false;
//		if (originalPackage.equals(service.getPackageName()) && thirdPackage.equals("cn.wps.moffice"))
//		{
//			mIsValidPackage = true;
//			return true;
//		}
        return false;
    }

    @Override
    public void setAllowChangeCallBack(AllowChangeCallBack allowChangeCallBack) throws RemoteException
    {
        FloatServiceTest.setAllowCallBack(allowChangeCallBack);
    }

    @Override
    public String getMenuText(String arg0, String arg1) throws RemoteException
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int invoke(String arg0, String arg1) throws RemoteException
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isViewForbidden(String arg0, ViewType arg1)
            throws RemoteException
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isViewInVisible(String arg0, ViewType arg1)
            throws RemoteException
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void onMenuAtion(String arg0, String arg1) throws RemoteException
    {
        // TODO Auto-generated method stub

    }
}
