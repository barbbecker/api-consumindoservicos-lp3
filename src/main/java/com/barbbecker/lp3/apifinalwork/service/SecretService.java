package com.barbbecker.lp3.apifinalwork.service;

import com.barbbecker.lp3.apifinalwork.dto.SecretDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SecretService {

    private RestTemplate restTemplate;

    private static final String URL_API = "https://lp3-secret.herokuapp.com/secreto";
    private String user;
    private String password;


    public SecretService() {
        restTemplate = new RestTemplate();
        this.user = "barbara";
        this.password = "3s5$3ldmaflk88";
    }

    public SecretDto getSecret() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(user, password);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<SecretDto> secretDto = restTemplate.exchange(URL_API, HttpMethod.POST, entity, SecretDto.class);
        return secretDto.getBody();
    }
}
