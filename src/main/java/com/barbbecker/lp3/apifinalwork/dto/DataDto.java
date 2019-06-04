package com.barbbecker.lp3.apifinalwork.dto;

public class DataDto {

    private Double temperature;
    private String wind_direction;
    private Double wind_velocity;
    private Double humidity;
    private String condition;
    private Double pressure;
    private String icon;
    private Double sensation;
    private String date;

    public Double getTemperature() {
        return temperature;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public Double getWind_velocity() {
        return wind_velocity;
    }

    public Double getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }

    public Double getPressure() {
        return pressure;
    }

    public String getIcon() {
        return icon;
    }

    public Double getSensation() {
        return sensation;
    }

    public String getDate() {
        return date;
    }
}
