package com.selfstudy.spring.aop.demo;

import com.selfstudy.spring.aop.demo.service.TestService1;
import com.selfstudy.spring.aop.demo.service.TestService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
    final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Autowired
    TestService1 testService1;
    @Autowired
    TestService2 testService2;


    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testService1.test();
        testService2.test();
    }
}
