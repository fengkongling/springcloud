package com.flt.eureka_client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/info")
    public String hello(){
        String reponse = restTemplate.getForObject("http://SERVICE-PRODUCT/product/info", String.class);
        log.info("response：{}", reponse);
        return reponse;
    }
}
