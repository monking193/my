package com.example.demo2.controller;

import com.example.demo2.entity.Customer;
import com.example.demo2.service.CustomerInfoService;
import org.hibernate.StaleObjectStateException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class ThreadTest implements Runnable{
    private CustomerInfoService customerInfoService;
    private static final Lock lock = new ReentrantLock();    //注意这个地方
    Condition condition = lock.newCondition();

    @Override
    public void run(){
        //lock.lock();
        try{
            test();
            Customer customer = new Customer();
            customer.setCustomer_name("djd test");
            customer.setAge(20);
            customer.setId(839);
            customer.setBirthDay(new Date());
            customer.setOpenId(666);
            customerInfoService.save(839,666,20,new Date());
        }catch (StaleObjectStateException e){
            System.out.print(" 事物已被提交 ");
            e.printStackTrace();
        }finally {
            //lock.unlock();
        }
    }

    public ThreadTest(CustomerInfoService customerInfoService){
        this.customerInfoService = customerInfoService;
    }

    public  void test(){
        Customer customer = customerInfoService.getCustomerById(839);
        if(customer != null){
            customerInfoService.deleteById(839);
        }
    }
}
