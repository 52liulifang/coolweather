package com.example.cc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by cc on 2018/5/29.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public int getId() {
        return id;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
