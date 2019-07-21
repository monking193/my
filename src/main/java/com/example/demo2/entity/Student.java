package com.example.demo2.entity;

import com.example.demo2.reflectWithAnnotation.StudentAnnooation;

public class Student {
    @StudentAnnooation(columnName = "主鍵",dictionaryType = "")
    public int id;
    @StudentAnnooation(columnName = "電話",dictionaryType = "")
    public String tel;
    @StudentAnnooation(columnName = "姓名",dictionaryType = "nameType")
    public String name;
    @StudentAnnooation(columnName = "地址",dictionaryType = "address")
    public String address;
    @StudentAnnooation(columnName = "學號",dictionaryType = "")
    public String sto_no;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSto_no() {
        return sto_no;
    }
    public void setSto_no(String sto_no) {
        this.sto_no = sto_no;
    }
}
