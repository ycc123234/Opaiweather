package com.activity.opaiweaher.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by msi-pc on 2017/12/15.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
