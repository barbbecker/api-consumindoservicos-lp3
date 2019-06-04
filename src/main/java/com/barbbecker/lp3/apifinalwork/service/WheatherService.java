package com.barbbecker.lp3.apifinalwork.service;

import com.barbbecker.lp3.apifinalwork.dto.WheatherDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WheatherService {

    @Value("${ACCESS_TOKEN}")
    private String ACCESS_TOKEN;

    private static final String URL_WHEATHER = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/5346/current?token=";

    public WheatherDto getWheater() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet climatempo = new HttpGet(URL_WHEATHER + ACCESS_TOKEN);
        HttpResponse response = client.execute(climatempo);
        String body = EntityUtils.toString(response.getEntity());

        WheatherDto wheatherDto = objectMapper.readValue(body, WheatherDto.class);

        return wheatherDto;
    }
}
