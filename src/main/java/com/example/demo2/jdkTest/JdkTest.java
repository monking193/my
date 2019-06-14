package com.example.demo2.jdkTest;

public class JdkTest implements  interface1{


    @Override
    public void hello() {
        interface1.super.hello();
        System.out.print("666");
    }

    @Override
    public void test() {

    }

    public static  void main(String[] args){
        JdkTest jdkTest = new JdkTest();
        jdkTest.hello();

    }

}
