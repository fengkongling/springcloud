package com.flt.product1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "product-service")
public class Product1Application {

    public static void main(String[] args) {
        SpringApplication.run(Product1Application.class, args);
    }

}
