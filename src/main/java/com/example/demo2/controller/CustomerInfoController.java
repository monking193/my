package com.example.demo2.controller;

import com.example.demo2.entity.Customer;
import com.example.demo2.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    @RequestMapping(value = "/getCustomerById")
    public Customer getCustomerById(){
        return  customerInfoService.getCustomerById(1);
    }

    @RequestMapping(value = "/etCustomerByCustomer_name")
    public  Customer getCustomerByAge(int age){
        return  customerInfoService.getCustomerByCustomer_name(age);
    }

    @RequestMapping(value = "/saveCustomer")
    public  Customer save(Customer customer){
        Customer customer1 = new Customer();
        customer.setCustomer_name("djd test");
        customer.setAge(23);
        customer.setBirthDay(new Date());
        return  customerInfoService.save(customer);
    }



}
