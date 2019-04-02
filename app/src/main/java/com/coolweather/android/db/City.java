package com.coolweather.android.db;

/**
 * Created by 41914 on 2019/4/2.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(){
        this.provinceId=provinceId;
    }
}
