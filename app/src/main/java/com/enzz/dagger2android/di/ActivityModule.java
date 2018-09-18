package com.enzz.dagger2android.di;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */


@Module
public abstract class ActivityModule<T extends Activity> {

    @Provides
    @ActivityScope
    public Context context(T activity) {
        return activity;
    }

    @Provides
    @ActivityScope
    public Activity activity(T activity) {
        return activity;
    }
}
