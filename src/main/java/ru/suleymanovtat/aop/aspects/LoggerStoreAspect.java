package ru.suleymanovtat.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import ru.suleymanovtat.model.bean.Meal;

import java.util.ArrayList;

@Aspect
public class LoggerStoreAspect {

    @AfterReturning(pointcut = "execution(* ru.suleymanovtat.aop.Store.getListOfMeals())", returning = "listOfMeals")
    public void afterReturningGetListOfMealsAdvice(JoinPoint joinPoint, ArrayList<Meal> listOfMeals) {
        System.out.println(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        listOfMeals.add(new Meal("milk"));
    }

    @AfterThrowing(pointcut = "execution(* ru.suleymanovtat.aop.Store.getListOfMeals())", throwing = "error")
    public void afterThrowingGetListOfMealsAdvice(JoinPoint joinPoint, Throwable error) {
        System.out.println("_____________");
        System.out.println("afterThrowingGetListOfMealsAdvice: " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        System.out.println("afterThrowingGetListOfMealsAdvice: " + error.getMessage());
        System.out.println("_____________");
    }

    @After(value = "execution(* ru.suleymanovtat.aop.Store.getListOfMeals())")
    public void afterGetListOfMealsAdvice(JoinPoint joinPoint) {
        System.out.println("_____________");
        System.out.println("after: " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        System.out.println("_____________");
    }

    @Around("execution(* ru.suleymanovtat.aop.Store.getListOfMeals())")
    public Object aroundGetListOfMealsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("_____________aroundGetListOfMealsAdvice");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("object: " + object);
        System.out.println("_____________aroundGetListOfMealsAdvice");
        return object;
    }
}