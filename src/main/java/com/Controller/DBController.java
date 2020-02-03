package com.Controller;

import com.config.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据库连接配置进行一个测试
 * */
@RestController
public class DBController {
    @Autowired
    private DBConnector dbConnector;
    @GetMapping("/showDB")
    public void showDB(){
        dbConnector.configure();
    }
}
