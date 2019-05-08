package com.example.demo2.mapperDao;

import com.example.demo2.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentMapper {


    public Student getStudentById(long id);

    public void insertStudent(Student student);

    public  void deleteById(long id);

    public void updateStudentById(Student student);
}
