package com.whitecloak.androidboilerplate.di.component;

import com.whitecloak.androidboilerplate.ui.activity.MainActivity;
import com.whitecloak.androidboilerplate.di.module.ActivityModule;
import com.whitecloak.androidboilerplate.di.scope.PerActivity;

import dagger.Subcomponent;

/**
 * Created by xdgimf on 21/09/2016.
 */

@PerActivity
@Subcomponent(modules = {
        ActivityModule.class
})
public interface ActivityComponent {

    void inject(MainActivity activity);

}