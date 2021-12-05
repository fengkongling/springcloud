package com.flt.eureka_feign_client.api;

import com.flt.eureka_feign_client.config.FeignConfig;
import com.flt.eureka_feign_client.controller.HiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-PRODUCT", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface ProductApi {

    @GetMapping("/product/info")
    String product();
}
