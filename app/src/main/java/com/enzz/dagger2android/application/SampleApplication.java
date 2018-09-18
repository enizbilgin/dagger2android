package com.enzz.dagger2android.application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import retrofit2.Retrofit;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */

public class SampleApplication extends DaggerApplication {

    @Inject
    Retrofit retrofit;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerSampleApplicationComponent.builder()
                .application(this)
                .create(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
