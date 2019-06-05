package com.barbbecker.lp3.apifinalwork.dto;

public class ErrorsDto {

    private String status;
    private SourceDto sourceDto;
    private String detail;
    private String title;


    public String getStatus() {
        return status;
    }

    public SourceDto getSourceDto() {
        return sourceDto;
    }

    public String getDetail() {
        return detail;
    }

    public String getTitle() {
        return title;
    }
}
