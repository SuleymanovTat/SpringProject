package ru.suleymanovtat;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.suleymanovtat.model.Cat;
import ru.suleymanovtat.model.Dog;
import ru.suleymanovtat.model.People;
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

        People people = context.getBean("people", People.class);
        people.name();

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println("Name: "+cat.getName() + " age: " + cat.getAge());
        context.close();
    }
}
