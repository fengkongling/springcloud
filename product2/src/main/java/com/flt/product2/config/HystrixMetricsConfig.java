package com.flt.product2.config;

import com.soundcloud.prometheus.hystrix.HystrixPrometheusMetricsPublisher;
import io.prometheus.client.CollectorRegistry;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : fenglingtong
 * @Date: 2021-12-11 20:45
 */
@Configuration
public class HystrixMetricsConfig {

    @Autowired
    private CollectorRegistry collectorRegistry;

    @PostConstruct
    public void init() {
        HystrixPrometheusMetricsPublisher.builder().withRegistry(collectorRegistry).buildAndRegister();
    }

}
