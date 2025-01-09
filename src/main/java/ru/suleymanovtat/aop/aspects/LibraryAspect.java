package ru.suleymanovtat.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LibraryAspect {

    @Pointcut("execution(public void ru.suleymanovtat.aop.Library.getBook())")
    private void getBook() {
    }

    @Pointcut("execution(public void ru.suleymanovtat.aop.Library.getBook(ru.suleymanovtat.model.bean.Book))")
    private void getBookName() {
    }

    //&& || !
    @Pointcut("execution(* ru.suleymanovtat.aop.Library.*(..)) && !execution(* ru.suleymanovtat.aop.Library.getBookName(..)) ")
    private void allMethods() {}

    @Before("getBook()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: 1 попытка получить книгу");
    }

    @Before("getBookName()")
    public void beforeGetBookNameAdvice() {
        System.out.println("beforeGetBookNameAdvice: 2 попытка получить книгу");
    }

    @Before("allMethods()")
    public void beforeAllMethodsAdvice() {
        System.out.println("beforeAllMethodsAdvice: ВСЕГДА");
    }
}
