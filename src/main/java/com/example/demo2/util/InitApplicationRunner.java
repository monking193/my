package com.example.demo2.util;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * * 项目启动后数据初始化
 */
@Component
public class InitApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("初始化：InitApplicationRunner");
    }
}
