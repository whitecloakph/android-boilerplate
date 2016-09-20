package com.whitecloak.androidboilerplate.ui.activity;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.whitecloak.androidboilerplate.App;
import com.whitecloak.androidboilerplate.di.component.ActivityComponent;
import com.whitecloak.androidboilerplate.di.module.ActivityModule;

/**
 * Created by xdgimf on 21/09/2016.
 */

public class BaseActivity extends RxAppCompatActivity {

    private ActivityComponent mComponent;

    public ActivityComponent getComponent() {
        if (mComponent == null) {
            mComponent = App.from(this).getComponent().plus(new ActivityModule(this));
        }
        return mComponent;
    }

}
