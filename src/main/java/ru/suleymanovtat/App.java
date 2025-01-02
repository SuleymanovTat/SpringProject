package ru.suleymanovtat;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.suleymanovtat.model.*;

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

        People people = context.getBean("people", People.class);
        people.name();

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println("Name: "+cat.getName() + ", age: " + cat.getAge());

        Phone phone = context.getBean("phone", Phone.class);
        System.out.println("Name: "+phone.getName() + ", model: " + phone.getModel());
        context.close();
    }
}
