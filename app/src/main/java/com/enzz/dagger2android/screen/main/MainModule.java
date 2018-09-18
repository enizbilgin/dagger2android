package com.enzz.dagger2android.screen.main;

import com.enzz.dagger2android.di.ActivityModule;
import com.enzz.dagger2android.di.ActivityScope;
import com.enzz.dagger2android.di.FragmentScope;
import com.enzz.dagger2android.screen.main.activities.MainActivity;
import com.enzz.dagger2android.screen.main.fragments.MainFragment;
import com.enzz.dagger2android.screen.main.models.User;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */
public class MainModule {

    @Module
    public static class MainActivityModule extends ActivityModule<MainActivity> {

        // Main Activity module
        @ActivityScope
        @Provides
        public User provideUser() {
            return new User();
        }


        @Module
        public static abstract class MainFragmentsModule {

            @FragmentScope
            @ContributesAndroidInjector(modules = {

            })
            abstract MainFragment mainFragment();
        }
    }

    @Module
    public abstract class MainModuleScreenModule {

        @ActivityScope
        @ContributesAndroidInjector(modules = {
                MainModule.MainActivityModule.class,
                MainModule.MainActivityModule.MainFragmentsModule.class,
        })
        abstract MainActivity mainActivity();
    }
}
