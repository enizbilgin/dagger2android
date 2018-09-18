package com.enzz.dagger2android.screen.main.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.enzz.dagger2android.R;
import com.enzz.dagger2android.screen.main.fragments.MainFragment;
import com.enzz.dagger2android.screen.main.models.User;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import retrofit2.Retrofit;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    Retrofit retrofit;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content, new MainFragment());
        ft.commit();
    }
}
