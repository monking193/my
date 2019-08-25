package com.example.demo2.util;


import com.alibaba.fastjson.JSONObject;
import com.example.demo2.entity.JsonTestClass;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonTest {

    public static void main(String[] args) {

        String test = "{\n" +
                "\t\"reason\": \"d\",\n" +
                "\t\"action\": \"李豫川 \",\n" +
                "\t\"msg\": [{\n" +
                "\t\t\"posType\": \"3\",\n" +
                "\t\t\"detail\": \"666\",\n" +
                "\t\t\"policyNo\": \"777\"\n" +
                "\t}]\n" +
                "}";

        JsonTestClass test1 = JSONObject.parseObject(test, JsonTestClass.class);
        String temp = test1.getMsg();
        System.out.print(temp);
    }


}
