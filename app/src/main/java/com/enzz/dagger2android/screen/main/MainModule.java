package com.enzz.dagger2android.screen.main;

import android.arch.lifecycle.ViewModelProviders;

import com.enzz.dagger2android.di.ActivityModule;
import com.enzz.dagger2android.di.ActivityScope;
import com.enzz.dagger2android.di.FragmentScope;
import com.enzz.dagger2android.screen.main.activities.MainActivity;
import com.enzz.dagger2android.screen.main.fragments.MainFragment;
import com.enzz.dagger2android.screen.main.services.MainService;
import com.enzz.dagger2android.screen.main.viewmodels.MainViewModel;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import retrofit2.Retrofit;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */
public class MainModule {

    @Module
    public static class MainActivityModule extends ActivityModule<MainActivity> {

        // Main Activity module
        @ActivityScope
        @Provides
        public MainService provideService(Retrofit retrofit) {
            return retrofit.create(MainService.class);
        }

        @ActivityScope
        @Provides
        public MainViewModel provideViewModel(MainActivity activity, MainService service) {
            MainViewModel viewModel = ViewModelProviders.of(activity).get(MainViewModel.class);
            viewModel.setService(service);
            return viewModel;
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
