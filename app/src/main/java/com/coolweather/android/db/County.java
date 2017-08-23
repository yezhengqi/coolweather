package com.coolweather.android.db;

/**
 * Created by ThinkPad on 2017/8/23.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private int countyCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(){
        this.countyName=countyName;
    }
    public int getCountyCode(){
        return countyCode;
    }
    public void setCountyCode(){
        this.countyCode=countyCode;
    }
}
