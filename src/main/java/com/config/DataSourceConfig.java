package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 因为Druid数据源的属性设置无法生效，
 * 所以自定义配置类，将配置文件的属性
 * 注入到Druid数据源属性中。
 * */
@Configuration
public class DataSourceConfig {
     @Bean//将new DruidDataSource产生的对象注入到Spring容器中
     //作用有两个：
     // 1.把配置文件中已配置好的bean拿来用，完成属性和方法的组装；
     // 2.一般是把要实例化的类对象转换成一个bean，然后放到ioc容器中，等到要用的时候和@Autowired以及
     //@Resource一起使用，进行属性、方法的完美组装。
     //它是和实例化对象注解、属性值注入的注解配合使用来的，用来产生bean或者是获取bean

     @ConfigurationProperties(prefix = "spring.datasource")
     //将之前在application.properties中设置的属性值注入到DataSource类对象中
     public DataSource getDruid(){
         return new DruidDataSource();
     }
}
