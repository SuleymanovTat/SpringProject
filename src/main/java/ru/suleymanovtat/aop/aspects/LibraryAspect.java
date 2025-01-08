package ru.suleymanovtat.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LibraryAspect {

    @Before("execution(public void ru.suleymanovtat.aop.Library.getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }
}
