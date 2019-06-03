package com.barbbecker.lp3.apitrabalhofinal.Service;

import com.barbbecker.lp3.apitrabalhofinal.dto.ZenDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZenService {

    private RestTemplate restTemplate;

    public ZenService() {
        restTemplate = new RestTemplate();
    }

    public ZenDto getPhraseZen() {
        String phraseZen = restTemplate.getForObject("https://api.github.com/zen", String.class);

        ZenDto zenDto = new ZenDto();
        zenDto.setMotivationalPhrase(phraseZen);

        return zenDto;
    }

}
