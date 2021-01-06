package com.mysunnyweather.android.logic.model;

public class Weather {
    RealtimeResponse.Realtime realtime;
    DailyResponse.Daily daily;

    public Weather() {
    }

    public Weather(RealtimeResponse.Realtime realtime, DailyResponse.Daily daily) {
        this.realtime = realtime;
        this.daily = daily;
    }

    public RealtimeResponse.Realtime getRealtime() {
        return realtime;
    }

    public void setRealtime(RealtimeResponse.Realtime realtime) {
        this.realtime = realtime;
    }

    public DailyResponse.Daily getDaily() {
        return daily;
    }

    public void setDaily(DailyResponse.Daily daily) {
        this.daily = daily;
    }
}
