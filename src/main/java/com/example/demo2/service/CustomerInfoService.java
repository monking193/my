package com.example.demo2.service;

import com.example.demo2.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoService {

    @Autowired
    private CustomerInfoRepository customerInfoRepository;

    public Customer getCustomerById(int id){
        Customer customer = customerInfoRepository.findById(id);
        return  customer;
    }

    public  Customer getCustomerByCustomer_name(int age){
        return  customerInfoRepository.findByAge(age);
    }

    public  Customer save(Customer customer){
        return  customerInfoRepository.save(customer);
    }

}
