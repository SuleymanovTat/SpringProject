package ru.suleymanovtat.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {

    @Pointcut("execution(* ru.suleymanovtat.aop.Library.*(..))")
    private void allMethods() {
    }

    @Before("allMethods()")
    public void beforeAllMethodsAdvice() {
        System.out.println("beforeAllMethodsAdvice: Logger");
    }
}