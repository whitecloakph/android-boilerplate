package com.whitecloak.androidboilerplate.di.module;

import android.app.Activity;
import android.support.annotation.NonNull;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xdgimf on 21/09/2016.
 */

@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(@NonNull Activity activity) {
        mActivity = activity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

}
