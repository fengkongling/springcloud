package com.flt.eureka_feign_client.controller;

import com.flt.eureka_feign_client.service.HiService;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hi")
@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/info")
    public String sayHi(){
        return hiService.getProductInfo();
    }
}
