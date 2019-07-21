package com.example.demo2.service;

import com.example.demo2.entity.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public interface CustomerInfoRepository extends CrudRepository<Customer,Integer> {
    //jpa 锁定一行记录
    //@Query(value = "select * from customer_info where id =:id for update",nativeQuery = true)
    public  Customer findById(int id);

    public  Customer findByAge(int age);

    @Query(value = "update customer_info set customer_name=:customer_name,age=:age,birthDay=:birthDay where id=:id and version=:version",nativeQuery = true)
    @Modifying
    @Transactional
    public void updateCustomer(@Param("customer_name")String customer_name,@Param("age")String age,@Param("birthDay")String birthDay,
                                @Param("id")String id,@Param("version")String version);
    @Query(value="delete  from customer_info where id=:id ",nativeQuery = true)
    @Modifying
    @Transactional
    public void deleteById(@Param("id") int id);

    /**
     * 使用Replace，如果旧记录与新记录有相同的值，则在新记录被插入之前，旧记录被删除，存入新纪录
     * 使用ignore关键字，避免重复插入记录可以使用,例如：insert ignore student_task_trace (student_id,task_plan_reads_options_id,sub_type) VALUES (111111,51,0)
     */
    @Query(value="replace into customer_info(id,open_id,age,birth_day) values(?1,?2,?3,?4)",nativeQuery = true)
    @Modifying
    @Transactional
    public void save(int id ,int openid,int age,Date date);

}
