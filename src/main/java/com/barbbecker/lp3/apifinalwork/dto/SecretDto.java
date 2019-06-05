package com.barbbecker.lp3.apifinalwork.dto;

import java.util.ArrayList;
import java.util.List;

public class SecretDto {

    private List<ErrorsDto> errorsDtos;

    public SecretDto() {
        errorsDtos = new ArrayList<>();
    }

    public List<ErrorsDto> getErrorsDtos() {
        return errorsDtos;
    }
}
