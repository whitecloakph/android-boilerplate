package com.whitecloak.androidboilerplate;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.whitecloak.androidboilerplate.di.component.AppComponent;
import com.whitecloak.androidboilerplate.di.component.DaggerAppComponent;
import com.whitecloak.androidboilerplate.di.module.AppModule;

import timber.log.Timber;

/**
 * Created by xdgimf on 21/09/2016.
 */

public class App extends Application {

    private AppComponent mComponent;

    public AppComponent getComponent() {
        return mComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        mComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @NonNull
    public static App from(@NonNull Context context) {
        return (App) context.getApplicationContext();
    }

}
