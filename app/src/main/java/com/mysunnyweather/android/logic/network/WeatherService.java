package com.mysunnyweather.android.logic.network;


import com.mysunnyweather.android.SunnyWeatherApplication;
import com.mysunnyweather.android.logic.model.DailyResponse;
import com.mysunnyweather.android.logic.model.RealtimeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {

    @GET("v2.5/" + SunnyWeatherApplication.TOKEN + "/{lng},{lat}/realtime.json")
    Call<RealtimeResponse> getRealtimeWeather(@Path("lng") String lng, @Path("lat") String lat);

    @GET("v2.5/" + SunnyWeatherApplication.TOKEN + "/{lng},{lat}/daily.json")
    Call<DailyResponse> getDailyWeather(@Path("lng") String lng,@Path("lat") String lat);
}
