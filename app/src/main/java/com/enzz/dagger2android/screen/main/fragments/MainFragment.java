package com.enzz.dagger2android.screen.main.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.enzz.dagger2android.R;
import com.enzz.dagger2android.screen.main.models.User;
import com.enzz.dagger2android.screen.main.viewmodels.MainViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.HasSupportFragmentInjector;
import retrofit2.Retrofit;

public class MainFragment extends Fragment implements HasSupportFragmentInjector {

    // you can do this declaration in a abstract class
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Inject
    Retrofit retrofit;

    @Inject
    MainViewModel viewModel;

    // you can do this this in a abstract class
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        AndroidSupportInjection.inject(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    //region DaggerSupport
    // you can do this this in a abstract class
    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
    //endregion
}
