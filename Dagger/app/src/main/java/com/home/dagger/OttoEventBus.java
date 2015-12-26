package com.home.dagger;

import android.util.Log;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by davendar.ojha on 12/26/15.
 */

public class OttoEventBus {

    private final Bus bus;

    public OttoEventBus() {
        bus = new Bus(ThreadEnforcer.ANY, OttoEventBus.class.getName());
    }

    public void register(final Object o) {
        try {
            bus.register(o);
        } catch (final Throwable th) {
            Log.d("register failed", " " + th);
        }
    }

    public void unregister(final Object o) {
        try {
            bus.unregister(o);
        } catch (final Throwable th) {
            Log.d("unregister failed", " " + th);
        }
    }

    public void post(final Object e) {
        try {
            bus.post(e);
        } catch (final Throwable th) {
            Log.d("Post failed", " " + th);
        }
    }
}
