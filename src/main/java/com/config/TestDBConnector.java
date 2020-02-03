package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
@Profile("test")//指定多环境配置类的标识
public class TestDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("测试环境test");
    }
}
