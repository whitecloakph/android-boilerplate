package com.whitecloak.androidboilerplate.ui.fragment;

import com.trello.rxlifecycle.components.support.RxFragment;
import com.whitecloak.androidboilerplate.di.component.ActivityComponent;
import com.whitecloak.androidboilerplate.ui.activity.BaseActivity;

/**
 * Created by xdgimf on 21/09/2016.
 */

public class BaseFragment extends RxFragment {

    private ActivityComponent mComponent;

    public ActivityComponent getComponent() {
        if (!(getActivity() instanceof BaseActivity)) {
            throw new RuntimeException("Activity must extends BaseActivity to use this method.");
        }

        return ((BaseActivity) getActivity()).getComponent();
    }

}
