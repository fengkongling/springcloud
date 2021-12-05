package com.flt.eureka_feign_client.controller;

import com.flt.eureka_feign_client.api.ProductApi;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements ProductApi {
    @Override
    public String product() {
        return "sorry,service is error";
    }
}
