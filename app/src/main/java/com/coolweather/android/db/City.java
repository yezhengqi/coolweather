package com.coolweather.android.db;

/**
 * Created by ThinkPad on 2017/8/23.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(){
        this.cityCode=cityCode;
    }
}
