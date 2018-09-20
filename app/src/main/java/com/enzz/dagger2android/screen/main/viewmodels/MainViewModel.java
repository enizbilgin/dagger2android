package com.enzz.dagger2android.screen.main.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.enzz.dagger2android.screen.main.services.MainService;

/**
 * Created by eniz.bilgin on 20.09.2018.
 */

public class MainViewModel extends AndroidViewModel {

    private MainService service;

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public void setService(MainService service) {
        this.service = service;
    }
}
