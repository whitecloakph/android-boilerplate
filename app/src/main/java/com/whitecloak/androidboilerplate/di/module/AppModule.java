package com.whitecloak.androidboilerplate.di.module;

import android.content.Context;
import android.support.annotation.NonNull;

import com.whitecloak.androidboilerplate.App;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xdgimf on 21/09/2016.
 */

@Module
public class AppModule {

    private final App mApp;

    public AppModule(@NonNull App app) {
        mApp = app;
    }

    @Provides
    public App provideApp() {
        return mApp;
    }

    @Provides
    public Context provideContext() {
        return mApp;
    }

}
