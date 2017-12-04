package com.angle.hshb.materialtestdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by angle
 * 2017/12/1.
 */

public class MyApplication extends Application {

    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
