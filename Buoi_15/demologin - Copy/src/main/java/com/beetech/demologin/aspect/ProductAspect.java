package com.beetech.demologin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Aspect
@Controller
public class ProductAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @After("execution(* com.beetech.demologin.controller.ProductController.*(..))")  //khai bao joinPoint va su dung advice la After
    // * toan bo cac phuong thuc
    // hai cham ap dung cho toan bo cac tham so
    public void logAfterMethodCall(JoinPoint joinPoint){
        String nameMethod = joinPoint.getSignature().getName(); // Giup lay ten method
        logger.info("ten method " + nameMethod);
    }
}
