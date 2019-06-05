package com.barbbecker.lp3.apifinalwork.dto;

import java.util.ArrayList;
import java.util.List;

public class SecretDto {

    private String user;
    private String data_secret;
    private List<FriendsDto> friends;

    public SecretDto() {
        friends = new ArrayList<>();
    }

    public String getUser() {
        return user;
    }

    public String getData_secret() {
        return data_secret;
    }
}
