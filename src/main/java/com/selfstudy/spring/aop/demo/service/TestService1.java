package com.selfstudy.spring.aop.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService1 implements TestService {
    final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Override
    public void test() {
        logger.info("Inside TestService1 method");
    }
}
