package com.coolweather.android.db;

/**
 * Created by 41914 on 2019/4/2.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    private int getId(){
        return id;
    }
    private void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId)
    {
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(){
        this.cityId=cityId
    }
}
