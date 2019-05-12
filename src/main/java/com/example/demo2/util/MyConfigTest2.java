package com.example.demo2.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConfigTest2 {

    @Value("${spring1.datasource.driverClassName}")
    private String driverClass;

    @Value("${spring1.datasource.url}")
    private String url;

    @Value("${spring1.datasource.username}")
    private String password;

    @Value("${spring1.datasource.username}")
    private String name;

    @Autowired
    private MyConfigTest1 myConfigTest1;

    @GetMapping("/info")
    public  String info(){
        return this.driverClass + "  "  + this.url + "  " + this.password + "   " + this.name;
    }

    @GetMapping("/info1")
    public  String info1(){
       return myConfigTest1.getDriverClassName() + "   "  + myConfigTest1.getUsername() +  "  "
               + myConfigTest1.getPassword() + "   " + myConfigTest1.getUrl();
    }
}
