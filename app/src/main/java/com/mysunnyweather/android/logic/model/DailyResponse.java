package com.mysunnyweather.android.logic.model;


import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class DailyResponse {
    String status;
    Result result;

    public DailyResponse() {
    }

    public DailyResponse(String status, Result result) {
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
        Daily daily;

        public Result() {
        }

        public Result(Daily daily) {
            this.daily = daily;
        }

        public Daily getDaily() {
            return daily;
        }

        public void setDaily(Daily daily) {
            this.daily = daily;
        }
    }

    public static class Daily{
        List<Temperature> temperature;
        List<Skycon> skycon;
        @SerializedName("life_index")
        private LifeIndex lifeIndex;

        public Daily() {
        }

        public Daily(List<Temperature> temperature, List<Skycon> skycon, LifeIndex lifeIndex) {
            this.temperature = temperature;
            this.skycon = skycon;
            this.lifeIndex = lifeIndex;
        }

        public List<Temperature> getTemperature() {
            return temperature;
        }

        public void setTemperature(List<Temperature> temperature) {
            this.temperature = temperature;
        }

        public List<Skycon> getSkycon() {
            return skycon;
        }

        public void setSkycon(List<Skycon> skycon) {
            this.skycon = skycon;
        }

        public LifeIndex getLifeIndex() {
            return lifeIndex;
        }

        public void setLifeIndex(LifeIndex lifeIndex) {
            this.lifeIndex = lifeIndex;
        }
    }

    public static class Skycon{
        String value;
        Date date;

        public Skycon() {
        }

        public Skycon(String value, Date date) {
            this.value = value;
            this.date = date;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    public static class Temperature{
        Float max;
        Float min;

        public Temperature() {
        }

        public Temperature(Float max, Float min) {
            this.max = max;
            this.min = min;
        }

        public Float getMax() {
            return max;
        }

        public void setMax(Float max) {
            this.max = max;
        }

        public Float getMin() {
            return min;
        }

        public void setMin(Float min) {
            this.min = min;
        }
    }

    public static class LifeIndex{
        List<LifeDescription> coldRisk;
        List<LifeDescription> carWashing;
        List<LifeDescription> ultraviolet;
        List<LifeDescription> dressing;

        public LifeIndex() {
        }

        public LifeIndex(List<LifeDescription> coldRisk, List<LifeDescription> carWashing, List<LifeDescription> ultraviolet, List<LifeDescription> dressing) {
            this.coldRisk = coldRisk;
            this.carWashing = carWashing;
            this.ultraviolet = ultraviolet;
            this.dressing = dressing;
        }

        public List<LifeDescription> getColdRisk() {
            return coldRisk;
        }

        public void setColdRisk(List<LifeDescription> coldRisk) {
            this.coldRisk = coldRisk;
        }

        public List<LifeDescription> getCarWashing() {
            return carWashing;
        }

        public void setCarWashing(List<LifeDescription> carWashing) {
            this.carWashing = carWashing;
        }

        public List<LifeDescription> getUltraviolet() {
            return ultraviolet;
        }

        public void setUltraviolet(List<LifeDescription> ultraviolet) {
            this.ultraviolet = ultraviolet;
        }

        public List<LifeDescription> getDressing() {
            return dressing;
        }

        public void setDressing(List<LifeDescription> dressing) {
            this.dressing = dressing;
        }
    }

    public  static class LifeDescription{
        String desc;

        public LifeDescription() {
        }

        public LifeDescription(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
