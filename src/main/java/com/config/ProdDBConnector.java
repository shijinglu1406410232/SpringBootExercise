package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ProdDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("生产环境dev");
    }
}
