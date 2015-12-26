package com.home.dagger;

import android.app.Application;

/**
 * Created by davendar.ojha on 12/26/15.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.initialize(this);
    }
}
