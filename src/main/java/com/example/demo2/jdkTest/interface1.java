package com.example.demo2.jdkTest;

public interface interface1 {

    default void hello(){
        System.out.println("hi default");
    }

    static void helloWorld(){
        System.out.println("hello World！");
    }

    void test();
}
