package com.whitecloak.androidboilerplate.di.component;

import android.support.annotation.NonNull;

import com.whitecloak.androidboilerplate.di.module.ActivityModule;
import com.whitecloak.androidboilerplate.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by xdgimf on 21/09/2016.
 */

@Singleton
@Component(modules = {
        AppModule.class
})
public interface AppComponent {

    ActivityComponent plus(@NonNull ActivityModule module);

}
