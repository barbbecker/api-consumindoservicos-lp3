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
}
