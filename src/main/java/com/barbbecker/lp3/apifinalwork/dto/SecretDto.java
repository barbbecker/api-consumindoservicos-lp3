package com.barbbecker.lp3.apifinalwork.dto;

import java.util.ArrayList;
import java.util.List;

public class SecretDto {

    private List<ErrorDto> errors;

    public SecretDto() {
        errors = new ArrayList<>();
    }

    public List<ErrorDto> getErrors() {
        return errors;
    }
}
