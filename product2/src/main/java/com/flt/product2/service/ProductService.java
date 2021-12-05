package com.flt.product2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author : fenglingtong
 * @Date: 2021-07-17 14:47
 */
@Slf4j
@Component
public class ProductService {

    @HystrixCommand(fallbackMethod = "getFallback1", commandProperties = {
            @HystrixProperty(name = HystrixPropertiesManager.CIRCUIT_BREAKER_SLEEP_WINDOW_IN_MILLISECONDS
                    , value = "10000"),
            @HystrixProperty(name = HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS, value = "2000")
    })
    public String getProduct1() {
        log.info("1");
        try {
            Thread.sleep(2200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "1";
    }

    public String getFallback1() {
        log.info("Fallback1");
        return "Fallback1";
    }

    @HystrixCommand(fallbackMethod = "getFallback2", commandProperties = {
            @HystrixProperty(name = HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS, value = "1000")
    })
    public String getProduct2() {
        log.info("2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "2";
    }

    public String getFallback2() {
        log.info("Fallback2");
        return "Fallback2";
    }



}
