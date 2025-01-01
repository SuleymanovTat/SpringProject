package ru.suleymanovtat;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws BeansException {
        System.out.println("Hello World Spring maven");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = context.getBean("myPed", Dog.class);
        dog.say();
        context.close();
    }
}
