package com.example.demo2.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo2.entity.Student;
import com.example.demo2.mapperDao.StudentMapper;
import com.example.demo2.service.HttpAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {
    @Autowired
    private StudentMapper studentMapper;
    @Resource
    private HttpAPIService httpAPIService;

    @RequestMapping(value = "/getStudentById",method = RequestMethod.GET)
    public Student getStudentById(long id){
        return studentMapper.getStudentById(id);
    }

    @RequestMapping(value = "/insetStudent",method = RequestMethod.POST)
    public void insetStudent(@RequestBody Student student){
        studentMapper.insertStudent(student);
    }

    @RequestMapping(value = "/deleteStudent",method = RequestMethod.DELETE)
    public void deleteById(long id){
        studentMapper.deleteById(id);
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student){
        studentMapper.updateStudentById(student);
        return  student;
    }

    @RequestMapping(value = "/httpGetTest",method = RequestMethod.GET)
    public String httpGetTest() throws  Exception{
        String str = httpAPIService.doGet("http://localhost:8080/getStudentById?id=2");
        JSONObject jsonObj = JSONObject.parseObject(str);
        Student student = JSONObject.toJavaObject(jsonObj,Student.class);

        Map<String,Object> param = new HashMap<String,Object>();
        param.put("id",3);
        String str1 = httpAPIService.doGet("http://localhost:8080/getStudentById",param);
        return  str;
    }

    @RequestMapping(value = "/1httpGetTest",method = RequestMethod.GET)
    public String httpGetTest1() throws  Exception{
        synchronized (this){

        }
        return  "hello";
    }


}
