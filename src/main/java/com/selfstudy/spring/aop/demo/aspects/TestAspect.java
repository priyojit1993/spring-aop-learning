package com.selfstudy.spring.aop.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class TestAspect {
    final Logger logger = LoggerFactory.getLogger(getClass().getName());

    //What kind of method calls do we want to intercept

    /*
     * @Before is the advice
     * 1. pointcut is an expression of the form that defines what kind of method we want to intercept:
     *        execution(<return_type <package_name>.<class_name>.<method_name(<arguments>)>>)
     * eg: execution(* com.selfstudy.spring.aop.demo.service.*.*(..)) -> means any return type of any package  name of any class name of any method of any arguments
     *
     * 2. advice : it is the logic we write inside the annotated function like @Before,@After @BeforeReturning @AfterReturning etc.
     *3. Aspect: combination of pointcut and advice is called aspect
     *JoinPoint is the specific interception of a method call joinpoint holds the execution instance that is being intercepted by our advice method
     * Viewing: the entire process of our advice intercepting a method call is called viewing,framework that does viewing is called Viewer.
     *
     *
     * @Before advice annotation will make sure that this method is called before execution of the given pointcut methods
     *
     *
     *
     * */

    @Before("com.selfstudy.spring.aop.demo.aspects.PointCutConfiguration.particularPackagePointCut()") // pointcut
//    its a good practice to define the pointcut exprtession in a config class and then give the refference of the method that holds the point cut expression;
    public void before(JoinPoint joinPoint) {
        //advice
        logger.info("Intercepted Before Method Call {}", joinPoint);
    }

    //returning attribute hold the value returned by the intercepted method and it
    // will be executed after the method intercepted method calls return statement
    @AfterReturning(value = "com.selfstudy.spring.aop.demo.aspects.PointCutConfiguration.particularPackagePointCut()",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("Called After the {} method and returned {}", joinPoint, result);

    }


}
