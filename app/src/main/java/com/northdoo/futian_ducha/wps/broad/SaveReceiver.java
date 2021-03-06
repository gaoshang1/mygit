/**
 * 文件名：SaveReceiver.java
 * 创建者:fanguangcheng
 * 创建时间:2013.7.18
 * 作用：负责接收wps保存文件时发送的广播，解析并保存起来
 */

package com.northdoo.futian_ducha.wps.broad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.northdoo.futian_ducha.wps.utils.Define;
import com.northdoo.futian_ducha.wps.utils.SettingPreference;


public class SaveReceiver extends BroadcastReceiver
{
    SettingPreference settingPreference;

    /**
     * 接收wps关闭时发送的广播，同时记录关闭时的参数，以便下一次打开
     */
    public void onReceive(Context context, Intent intent)
    {
        settingPreference = new SettingPreference(context);

        boolean saveAs = intent.getExtras().getBoolean("SaveAs");
        String packageName = intent.getExtras().getString("ThirdPartyPackage");
        String savepath = intent.getExtras().getString("CurrentPath");

        settingPreference.setSettingParam(Define.THIRD_PACKAGE, packageName);
        settingPreference.setSettingParam(Define.SAVE_PATH, savepath);

//        Intent uploadIntent = new Intent(context, FileUploadService.class);
//        context.startService(uploadIntent);
        /*Toast.makeText(context, "当前文件路径: " + savepath + "\n第三方包名: " 
                + packageName + "\n是否另存: " + saveAs, Toast.LENGTH_LONG).show();*/
    }
}