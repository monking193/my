package com.example.demo2.util;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 项目启动后数据初始化
 */
@Component
public class Construct {

    @PostConstruct
    public void doConstruct() throws Exception {
        System.out.println("初始化：PostConstruct-----------66666");
    }
}
