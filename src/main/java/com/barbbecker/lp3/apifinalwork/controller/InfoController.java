package com.barbbecker.lp3.apifinalwork.controller;

import com.barbbecker.lp3.apifinalwork.dto.WheatherDto;
import com.barbbecker.lp3.apifinalwork.service.InfoService;
import com.barbbecker.lp3.apifinalwork.dto.InfoDto;
import com.barbbecker.lp3.apifinalwork.service.WheatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping
public class InfoController {

    @Autowired
    private InfoService infoService;

    @PostMapping(value = "/info", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<InfoDto> aggregateInfo() throws IOException {
        InfoDto infoDto = infoService.getInformations();
        return new ResponseEntity<>(infoDto, HttpStatus.OK);
    }

//    public Tempo getTempo() {
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/3477/current?token=114c2fb82134eb247ae8aa4e99911a41";
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"
//                + "(KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//        ResponseEntity<Tempo> tempo = restTemplate.exchange(url, HttpMethod.GET, entity, Tempo.class);
//        return tempo.getBody();
//    }
}
