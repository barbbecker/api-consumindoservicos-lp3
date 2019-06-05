package com.barbbecker.lp3.apifinalwork.service;

import com.barbbecker.lp3.apifinalwork.dto.InfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class InfoService {

    private ZenService zenService;
    private WheatherService wheatherService;
    private SecretService secretService;

    @Autowired
    public InfoService(ZenService zenService, WheatherService wheatherService, SecretService secretService) {
        this.zenService = zenService;
        this.wheatherService = wheatherService;
        this.secretService = secretService;
    }

    public InfoDto getInformations() throws IOException {
        InfoDto infoDto = new InfoDto();
        infoDto.setZenDto(zenService.getPhraseZen());
        infoDto.setWheatherDto(wheatherService.getWheater());
        infoDto.setSecretDto(secretService.getSecret());
        return infoDto;
    }
}
