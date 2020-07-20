package com.xmwdkk.boothprint.base;

import android.app.Application;

/**
 * @author air
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppInfo.init(getApplicationContext());
    }
}
