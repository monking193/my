package com.example.demo2.service;

import com.example.demo2.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    public  void save(int id ,int openid,int age,Date date){
        customerInfoRepository.save(id,openid,age,date);
    }

    @Transactional
    public void deleteById(int id){
        customerInfoRepository.deleteById(id);
    }

    public void updateCustomer(String customer_name,String age, String birthDay, String id,String version){
        customerInfoRepository.updateCustomer(customer_name,age,birthDay,id,version);
    }

}
