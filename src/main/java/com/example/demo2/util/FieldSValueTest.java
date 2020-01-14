package com.example.demo2.util;

import com.example.demo2.entity.Student;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;

public class FieldSValueTest {

    public void init() throws IllegalAccessException{
        Student student = new Student();
        student.name = "test";
        student.address = "666";
        student.tel = "180";

        Class<?> clazz = student.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            ReflectionUtils.makeAccessible(field);
            System.out.println(field.getName() + " : " + field.get(student));
        }
    }

    public static void main(String[] args) {
        try {
            FieldSValueTest test = new FieldSValueTest();
            test.init();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

}
