package com.example.demo2.reflectWithAnnotation;

import com.example.demo2.entity.Student;

import java.util.HashMap;

public class Test {

    public static void main(String[] args){
        Student student = new Student();
        student.setAddress("1");
        student.setTel("222222");
        student.setName("du");
        student.setId(3);
        student.setSto_no("4444");

        Student student1 = new Student();
        student1.setAddress("2");
        student1.setTel("222222-2222");
        student1.setName("li");
        student1.setId(3);
        student1.setSto_no("4444---222");

        EntityValueChanedUtil<Student> studentEntityValueChanedUtil = new EntityValueChanedUtil<Student>();
        studentEntityValueChanedUtil.contrastObj(student,student1);
    }
}
