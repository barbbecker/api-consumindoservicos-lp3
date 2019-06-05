package com.barbbecker.lp3.apifinalwork.dto;

public class ErrorDto {

    private String status;
    private SourceDto source;
    private String detail;
    private String title;


    public String getStatus() {
        return status;
    }

    public SourceDto getSource() {
        return source;
    }

    public String getDetail() {
        return detail;
    }

    public String getTitle() {
        return title;
    }
}
