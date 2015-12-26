package com.home.dagger;

import android.content.Context;

/**
 * Created by davendar.ojha on 12/26/15.
 */
public class Injector {

    public static volatile AppComponent APP_COMPONENT;

    public static void initialize(final Context context) {
        if (APP_COMPONENT == null) {
            synchronized (Injector.class) {
                if (APP_COMPONENT == null) {
                    APP_COMPONENT = DaggerAppComponent.builder()
                            .appModule(new AppModule(context))
                            .build();
                }
            }
        }
    }

}
