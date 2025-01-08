package ru.suleymanovtat.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LibraryAspect {

    @Before("execution(public void ru.suleymanovtat.aop.Library.getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: 1 попытка получить книгу");
    }

    @Before("execution(public void ru.suleymanovtat.aop.Library.getBook(ru.suleymanovtat.model.bean.Book))")
    public void beforeGetBookNameAdvice() {
        System.out.println("beforeGetBookNameAdvice: 2 попытка получить книгу");
    }
}
