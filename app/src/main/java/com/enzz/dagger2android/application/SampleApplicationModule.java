package com.enzz.dagger2android.application;

import com.enzz.dagger2android.screen.ScreenModule;

import dagger.Module;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */

@Module(
        includes = {
                // DaggerModule
                AndroidSupportInjectionModule.class,
                NetworkModule.class,
                // ScreenModule
                ScreenModule.class
        }
)
public abstract class SampleApplicationModule {

}
