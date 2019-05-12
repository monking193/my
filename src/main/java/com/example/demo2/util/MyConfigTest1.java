package com.example.demo2.util;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring1.datasource")
@PropertySource("classpath:config/myconfig.properties")
public class MyConfigTest1 {

    private String driverClassName;

    private String url;

    private String password;

    private String username;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }
}
