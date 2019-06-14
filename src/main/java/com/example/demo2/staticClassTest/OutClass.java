package com.example.demo2.staticClassTest;

public class OutClass {
    public static String a;
    public String b;

    public static class InnerClass{
        public int c;
        static int d;

        public  void method1(){
            System.out.println("method1");
        }

        public static String  method2(){
            return a;
        }
    }

    public class InnerClass1{
        public int f;

        public  void method1(){
            System.out.println("method1");
        }

        public String  method2(){
            return a;
        }
    }

}
