package com.home.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by davendar.ojha on 12/26/15.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);

    void inject(EventBusExample eventBusExample);
}
