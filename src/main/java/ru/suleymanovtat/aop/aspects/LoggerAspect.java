package ru.suleymanovtat.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import ru.suleymanovtat.model.bean.Book;

@Aspect
public class LoggerAspect {

    @Pointcut("execution(* ru.suleymanovtat.aop.Library.*(..))")
    private void allMethods() {
    }

    @Before("allMethods()")
    public void beforeAllMethodsAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        // Получение имени метода
        String methodName = signature.getName();
        // Получение значений параметров
        Object[] args = joinPoint.getArgs();
        // Вывод информации о параметрах и их значениях
        System.out.println("Method Name: " + methodName);
        for (Object arg : args) {
            if (arg instanceof Book) {
                System.out.println("______________________________");
                System.out.println("______________________________");
                Book book = (Book) arg;
                System.out.println("___Parameter Value: " + book.getName() + "___");
                System.out.println("______________________________");
                System.out.println("______________________________");
            }
        }
        System.out.println("beforeAllMethodsAdvice: Logger " + methodName);
    }
}