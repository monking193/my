package com.example.demo2.staticClassTest;

public class StaticClassTest {

    public static  void main(String[] args){

        OutClass.InnerClass innerClass = new OutClass.InnerClass();
        innerClass.method1();
        innerClass.method2();

        OutClass outClass = new OutClass();
        OutClass.InnerClass1 innerClass1 = outClass.new InnerClass1();

    }

}
