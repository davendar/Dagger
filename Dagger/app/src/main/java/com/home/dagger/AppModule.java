package com.home.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by davendar.ojha on 12/26/15.
 */

@Module
public class AppModule {


    String name;
    Context context;
    OttoEventBus eventBus;

    public AppModule(Context context) {
        name = "Dagger";
        this.context = context;
        eventBus = new OttoEventBus();
    }

    @Provides
    @Singleton
    public String providesName() {
        return name;
    }

    @Provides
    @Singleton
    public OttoEventBus providesEventBus() {
        return eventBus;
    }


}
