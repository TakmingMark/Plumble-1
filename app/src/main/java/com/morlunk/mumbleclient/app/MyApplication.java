package com.morlunk.mumbleclient.app;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    public static Context applicationContext;
    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext=this;
    }
}
