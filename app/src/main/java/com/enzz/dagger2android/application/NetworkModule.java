package com.enzz.dagger2android.application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by eniz.bilgin on 18.09.2018.
 */
@Module(

)
public class NetworkModule {

    @Singleton
    @Provides
    public Retrofit provideConfiguration() {
        return new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();
    }
}

