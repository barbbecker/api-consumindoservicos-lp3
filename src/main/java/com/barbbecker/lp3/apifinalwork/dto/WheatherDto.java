package com.barbbecker.lp3.apifinalwork.dto;

public class WheatherDto {

    private String id;
    private String name;
    private String state;
    private String country;
    private DataDto data;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public DataDto getData() {
        return data;
    }
}
