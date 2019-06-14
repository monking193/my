package com.example.demo2.staticClassTest;

public enum Festvial {
    SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);

    public int valueField;

    private  Festvial(int valueField){
        this.valueField = valueField;
    }

    public int getData(){
        return valueField;
    }

}
