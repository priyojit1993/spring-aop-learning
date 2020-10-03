package com.selfstudy.spring.aop.demo.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutConfiguration {
    @Pointcut("execution(* com.selfstudy.spring.aop.demo.service.*.*(..))")
    public void particularPackagePointCut() {
    }

    @Pointcut("execution(* com.selfstudy.spring.aop.demo.aspects.*.*(..))")
    public void particularPackagePointCut2() {
    }

    @Pointcut("com.selfstudy.spring.aop.demo.aspects.PointCutConfiguration.particularPackagePointCut()" +
            "&&com.selfstudy.spring.aop.demo.aspects.PointCutConfiguration.particularPackagePointCut2()")
    public void combinePointCut() {
    }


    @Pointcut("bean(*dao*)")
    public void beanNamePointCut() {
        //any name bean having the word dao in its name
    }


    @Pointcut("within(com.selfstudy.spring.aop.demo..*)")
    public void withinPointCut() {
    }

}
