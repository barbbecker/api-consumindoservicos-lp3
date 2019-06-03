package com.barbbecker.lp3.apitrabalhofinal.controller;

import com.barbbecker.lp3.apitrabalhofinal.Service.InfoService;
import com.barbbecker.lp3.apitrabalhofinal.dto.InfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InfoController {

    @Autowired
    private InfoService infoService;


    @GetMapping(value = "/info", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<InfoDto> aggregateInfo() {
        InfoDto infoDto = infoService.getInformations();
        return new ResponseEntity<>(infoDto, HttpStatus.OK);
    }
}
