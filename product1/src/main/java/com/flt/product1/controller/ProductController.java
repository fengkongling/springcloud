package com.flt.product1.controller;

import com.flt.eureka_feign_client.api.ProductApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController implements ProductApi {

    @GetMapping("/info")
    public String product(){
        log.info("product1======");
        return "product1";
    }
}
