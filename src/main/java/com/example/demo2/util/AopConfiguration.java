package com.example.demo2.util;

import com.example.demo2.service.TrackTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopConfiguration {

    @Pointcut("execution(* com.example.demo2.controller..*.*(..))")
    public void excudeService(){}

    @Before("excudeService() && this(proxy)")
    public void beforeAdvide(JoinPoint point, Object proxy){
        System.out.println("before aop ---------------");
        System.out.println("before aop ---------------" + point);
    }

    @After("excudeService() && this(proxy)")
    public void afterAdvide(JoinPoint point, Object proxy){
        System.out.println("after aop ---------------");
        System.out.println("after aop ---------------" + point);
    }

    @Around("@annotation(trackTime)")
    public Object around(ProceedingJoinPoint joinPoint, TrackTime trackTime) throws Throwable {
        Object result = null;
        long startTime = System.currentTimeMillis();
        result = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println(" -------------> Time Taken by " + joinPoint + " with param[" + trackTime.param() + "] is " + timeTaken);
        return result;
    }
}
