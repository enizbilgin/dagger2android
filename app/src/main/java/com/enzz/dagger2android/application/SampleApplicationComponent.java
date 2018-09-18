package com.enzz.dagger2android.application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */

@Singleton
@Component(modules = {
        SampleApplicationModule.class,
})
public interface SampleApplicationComponent extends AndroidInjector<SampleApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<SampleApplication> {

        @BindsInstance
        public abstract Builder application(SampleApplication application);

        public abstract SampleApplicationComponent build();

    }

}
