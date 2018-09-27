package com.northdoo.futian_ducha.wps.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

import com.northdoo.futian_ducha.wps.utils.Define;
import com.northdoo.futian_ducha.wps.utils.Util;

import cn.wps.moffice.service.OfficeService;

@SuppressLint("Instantiatable")
public class BindService extends Service
{
    private Object mLockObject = new Object();
    private boolean mIsBound;
    public OfficeService mService;
    static OfficeService iService;
    private Context mContext;
    protected static final String TAG = BindService.class.getSimpleName();

    @SuppressLint("Instantiatable")
    public BindService(Context context)
    {
        this.mContext = context;
        if (iService == null)
            doBindService(mContext);
    }


    public OfficeService getOfficeService()
    {
        if (iService == null)
            doBindService(mContext);
        return iService;
    }

    public ServiceConnection serConnect()
    {
        if (iService == null)
            doBindService(mContext);
        return connection;
    }

    /**
     * 绑定服务
     *
     * @return
     */
    public boolean doBindService(Context context)
    {
        final Intent intent = new Intent(Define.PRO_OFFICE_SERVICE_ACTION);
        intent.setPackage("com.kingsoft.moffice_pro");
        intent.putExtra("DisplayView", true);
        boolean isBind = context.bindService(intent, connection, BIND_AUTO_CREATE);
        synchronized (mLockObject)
        {
            mLockObject.notifyAll();
        }
        if (!isBind)
        {
            context.unbindService(connection);
            reDoBindService(context);
        } else
        {
            mIsBound = true;
            //Util.showToast(mContext, "当前连接的是Service-1:" + Define.PRO_OFFICE_SERVICE_ACTION);
        }
        return mIsBound;
    }

    void reDoBindService(Context context)
    {
        Intent intent = new Intent(Define.OFFICE_SERVICE_ACTION);
        intent.setPackage("com.kingsoft.moffice_pro");
        intent.putExtra("DisplayView", true);
        boolean isBind = false;
        try
        {
            isBind = context.bindService(intent, connection, BIND_AUTO_CREATE);
        } catch (Exception e)
        {
            // TODO: handle exception
        }
        if (isBind)
        {
            mIsBound = true;
            //Util.showToast(mContext, "当前连接的是Service-2:" + Define.OFFICE_SERVICE_ACTION);
        } else
        {
            Util.showToast(mContext, "Service绑定失败， 请确认是否已安装WPS专业版本！");
        }
    }

    void doUnbindService()
    {
        if (mIsBound)
        {
            unbindService(connection);
            mIsBound = false;
        }
    }

    private ServiceConnection connection = new ServiceConnection()
    {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service)
        {
            mService = OfficeService.Stub.asInterface(service);
            synchronized (mLockObject)
            {
                mLockObject.notifyAll();
            }
            iService = mService;
        }

        @Override
        public void onServiceDisconnected(ComponentName name)
        {
            mService = null;
        }
    };


    @Override
    public IBinder onBind(Intent intent)
    {
        // TODO Auto-generated method stub
        return null;
    }


}
