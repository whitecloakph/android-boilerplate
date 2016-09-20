package com.whitecloak.androidboilerplate.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Miguel on 13/10/2015.
 * Copyright (c) 2015 White Cloak Technologies, Inc. All rights reserved.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
