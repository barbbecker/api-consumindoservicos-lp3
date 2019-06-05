package com.barbbecker.lp3.apifinalwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ApifinalworkApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApifinalworkApplication.class);
        springApplication.setDefaultProperties(Collections.singletonMap("server.port", "8092"));
        springApplication.run(args);
    }

}
