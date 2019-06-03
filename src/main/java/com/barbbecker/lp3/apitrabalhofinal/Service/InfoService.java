package com.barbbecker.lp3.apitrabalhofinal.Service;

import com.barbbecker.lp3.apitrabalhofinal.dto.InfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private ZenService zenService;

    @Autowired
    public InfoService(ZenService zenService) {
        this.zenService = zenService;
    }

    public InfoDto getInformations() {
        InfoDto infoDto = new InfoDto();
        infoDto.setZenDto(zenService.getPhraseZen());

        return infoDto;
    }
}
