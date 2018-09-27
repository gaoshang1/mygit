package com.northdoo.futian_ducha.Application;

import android.app.Application;

import com.northdoo.luohu.ITaskBinder;

public class OAApp extends Application
{

    
    
    
    public static ITaskBinder service; //监听服务

    @Override
    public void onCreate()
    {
        super.onCreate();

    }
}
