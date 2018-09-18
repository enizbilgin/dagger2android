package com.enzz.dagger2android.screen;

import com.enzz.dagger2android.screen.main.MainModule;

import dagger.Module;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */

@Module(
        includes = {
                MainModule.MainModuleScreenModule.class,
        }
)
public abstract class ScreenModule {

}
