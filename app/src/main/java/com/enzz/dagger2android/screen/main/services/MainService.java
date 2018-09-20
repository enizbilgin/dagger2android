package com.enzz.dagger2android.screen.main.services;

import com.enzz.dagger2android.screen.main.models.User;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by eniz.bilgin on 20.09.2018.
 */

public interface MainService {

    @GET("trends/user.json")
    Observable<List<User>> getUsers(@Query("id") String placeId);
}
