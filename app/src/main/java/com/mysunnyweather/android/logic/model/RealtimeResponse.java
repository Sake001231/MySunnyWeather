package com.mysunnyweather.android.logic.model;

import com.google.gson.annotations.SerializedName;

public class RealtimeResponse {

    private String status;
    private Result result;

    public RealtimeResponse() {
    }

    public RealtimeResponse(String status, Result result) {
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public static class Result{
        private Realtime realtime;

        public Result() {
        }

        public Result(Realtime realtime) {
            this.realtime = realtime;
        }

        public Realtime getRealtime() {
            return realtime;
        }

        public void setRealtime(Realtime realtime) {
            this.realtime = realtime;
        }
    }

    public static class Realtime{
        private String skycon;
        private Float temperature;
        @SerializedName("air_quality")
        private AirQuality airQuality;

        public Realtime() {
        }

        public Realtime(String skycon, Float temperature, AirQuality airQuality) {
            this.skycon = skycon;
            this.temperature = temperature;
            this.airQuality = airQuality;
        }

        public String getSkycon() {
            return skycon;
        }

        public void setSkycon(String skycon) {
            this.skycon = skycon;
        }

        public Float getTemperature() {
            return temperature;
        }

        public void setTemperature(Float temperature) {
            this.temperature = temperature;
        }

        public AirQuality getAirQuality() {
            return airQuality;
        }

        public void setAirQuality(AirQuality airQuality) {
            this.airQuality = airQuality;
        }
    }

    public static class AirQuality{
        private AQI aqi;

        public AirQuality() {
        }

        public AirQuality(AQI aqi) {
            this.aqi = aqi;
        }

        public AQI getAqi() {
            return aqi;
        }

        public void setAqi(AQI aqi) {
            this.aqi = aqi;
        }
    }

    public static class AQI{
        private Float chn;

        public AQI() {
        }

        public AQI(Float chn) {
            this.chn = chn;
        }

        public Float getChn() {
            return chn;
        }

        public void setChn(Float chn) {
            this.chn = chn;
        }
    }
}
