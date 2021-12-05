package com.flt.eureka_feign_client.service;

import com.flt.product1.api.ProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    private ProductApi productApi;

    public String getProductInfo(){
        return productApi.product();
    }
}
