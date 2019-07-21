package com.example.demo2.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer_info")
public class Customer {
    @Column(name = "customer_name",length = 32)
    private String customer_name;
    @Column(name = "customer_info",length = 32)
    private String customer_info;
    @Column(name = "age",length = 15)
    private int age;
    //@Temporal(TemporalType.TIMESTAMP)
    private Date birthDay;
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private Integer openId;
    //@Version
    //private int version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_info() {
        return customer_info;
    }

    public void setCustomer_info(String customer_info) {
        this.customer_info = customer_info;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /*public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }*/

    public Integer getOpenId() {
        return openId;
    }

    public void setOpenId(Integer openId) {
        this.openId = openId;
    }
}
