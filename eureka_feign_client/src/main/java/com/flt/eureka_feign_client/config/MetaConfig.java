package com.flt.eureka_feign_client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "youyu")
public class MetaConfig {

    private String basePackage ="";
}
