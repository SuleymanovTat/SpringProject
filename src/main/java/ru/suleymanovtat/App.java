package ru.suleymanovtat;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.suleymanovtat.model.Dog;
import ru.suleymanovtat.model.Person;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws BeansException {
        System.out.println("Hello World Spring maven");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = context.getBean("myPed", Dog.class);
        dog.say();

        Person person = context.getBean("person", Person.class);
        person.animalName();
        context.close();
    }
}
