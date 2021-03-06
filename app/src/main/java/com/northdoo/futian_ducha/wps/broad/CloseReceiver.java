/*
 * 	 文件名：CloseReceiver.java
 * 	创建者:fanguangcheng
 * 	创建时间:2013.7.18
 * 	作用：负责接收wps关闭时发送的广播，解析并保存起来
 */
package com.northdoo.futian_ducha.wps.broad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.northdoo.futian_ducha.wps.service.FloatServiceTest;
import com.northdoo.futian_ducha.wps.utils.Define;
import com.northdoo.futian_ducha.wps.utils.SettingPreference;


public class CloseReceiver extends BroadcastReceiver
{
    SettingPreference settingPreference;

    /**
     * 接收wps关闭时发送的广播，同时记录关闭时的参数，以便下一次打开
     */
    public void onReceive(Context context, Intent intent)
    {
        settingPreference = new SettingPreference(context);

        String name = intent.getExtras().getString("CurrentPath");
        String packageName = intent.getExtras().getString("ThirdPartyPackage");
        float ViewProgress = intent.getExtras().getFloat("ViewProgress");
        float ViewScale = intent.getExtras().getFloat("ViewScale");
        int ViewScrollX = intent.getExtras().getInt("ViewScrollX");
        int ViewScrollY = intent.getExtras().getInt("ViewScrollY");

        settingPreference.setSettingParam(Define.VIEW_PROGRESS, ViewProgress);
        settingPreference.setSettingParam(Define.VIEW_SCALE, ViewScale);
        settingPreference.setSettingParam(Define.VIEW_SCROLL_X, ViewScrollX);
        settingPreference.setSettingParam(Define.VIEW_SCROLL_Y, ViewScrollY);
        settingPreference.setSettingParam(Define.CLOSE_FILE, name);
        settingPreference.setSettingParam(Define.THIRD_PACKAGE, packageName);


//        Util.showToast(context, "文件路径: " + name + "\n第三方包名: " + packageName
//        		+ "\n文件查看的进度: " + ViewProgress + "\n上次查看的视图的缩放: " + ViewScale 
//        		+ "\nX坐标: " + ViewScrollX + "\nY坐标: " + ViewScrollY);

        //关闭service
        if (FloatServiceTest.isBound)
            FloatServiceTest.stopService();

    }
}