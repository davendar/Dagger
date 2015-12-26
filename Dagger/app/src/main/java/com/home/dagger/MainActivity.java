package com.home.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String name;

    @Inject
    OttoEventBus eventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.APP_COMPONENT.inject(this);
        eventBus.register(this);
        setContentView(R.layout.activity_main);
        TextView tvHelloDagger = (TextView) findViewById(R.id.tvHelloDagger);
        tvHelloDagger.setText(name);
        BlaBla bla = new BlaBla();
        eventBus.post(new LoadEvent(1));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        eventBus.unregister(this);
    }
}
