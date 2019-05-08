package com.example.demo2.service;

import com.example.demo2.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInfoRepository extends CrudRepository<Customer,Integer> {
    public  Customer findById(int id);

    public  Customer findByAge(int age);

    public  Customer save(Customer customer);

}
