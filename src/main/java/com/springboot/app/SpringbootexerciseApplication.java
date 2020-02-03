package com.springboot.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//加载配置并扫描包，并开启实例化类
@SpringBootApplication(scanBasePackages = "com.Controller.*")
//源码好像没有入参
@MapperScan("com.mapper.*")
public class SpringbootexerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootexerciseApplication.class, args);
	}

}
