package ru.suleymanovtat.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import ru.suleymanovtat.model.bean.Meal;

import java.util.ArrayList;

@Aspect
public class LoggerStoreAspect {

    @AfterReturning(pointcut = "execution(* ru.suleymanovtat.aop.Store.getListOfMeals())", returning = "listOfMeals")
    public void AfterReturningGetListOfMealsAdvice(JoinPoint joinPoint, ArrayList<Meal> listOfMeals) {
        System.out.println(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        listOfMeals.add(new Meal("milk"));
    }
}