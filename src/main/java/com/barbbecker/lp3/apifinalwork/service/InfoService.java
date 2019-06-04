package com.barbbecker.lp3.apifinalwork.service;

import com.barbbecker.lp3.apifinalwork.dto.InfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class InfoService {

    private ZenService zenService;
    private WheatherService wheatherService;

    @Autowired
    public InfoService(ZenService zenService, WheatherService wheatherService) {
        this.zenService = zenService;
        this.wheatherService = wheatherService;
    }

    public InfoDto getInformations() throws IOException {
        InfoDto infoDto = new InfoDto();
        infoDto.setZenDto(zenService.getPhraseZen());
        infoDto.setWheatherDto(wheatherService.getWheater());
        return infoDto;
    }
}
