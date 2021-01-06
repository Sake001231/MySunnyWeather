package com.mysunnyweather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {

    public static  final String TOKEN = "ceQe6yy3nBnM9Y0y";

    @SuppressLint("StaticFieldLeak")
    static public Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context =getApplicationContext();
    }
}
