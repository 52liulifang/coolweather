package com.example.cc.coolweather.gson;

/**
 * Created by cc on 2018/5/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
