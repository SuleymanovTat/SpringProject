package ru.suleymanovtat;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.suleymanovtat.model.annotation.Albom;
import ru.suleymanovtat.model.annotation.Audio;
import ru.suleymanovtat.model.annotation.Music;
import ru.suleymanovtat.model.annotation.User;
import ru.suleymanovtat.model.bean.*;

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
        System.out.println("Name: " + cat.getName() + ", age: " + cat.getAge());

        Phone phone = context.getBean("phone", Phone.class);
        System.out.println("Name: " + phone.getName() + ", model: " + phone.getModel());

        Table table = context.getBean("table", Table.class);
        Table table2 = context.getBean("table", Table.class);
        System.out.println("Table name: " + table.getName());
        System.out.println("Table == table2: " + (table == table2));
        context.close();

        ClassPathXmlApplicationContext contextAnnotation = new ClassPathXmlApplicationContext("applicationAnnotationContext.xml");
        Music music = contextAnnotation.getBean("musicId", Music.class);
        music.play();
        music.pause();

        Audio audio = contextAnnotation.getBean("audio", Audio.class);
        audio.play();
        audio.pause();

        System.out.println("\nAlbom");
        Albom albom = contextAnnotation.getBean("albomId", Albom.class);
        albom.audio.play();
        albom.audio.pause();

        albom.music.pause();
        albom.music.pause();

        albom.playVideo();
        albom.pauseVideo();
        System.out.println();

        User user = contextAnnotation.getBean("userId", User.class);
        user.runCar();
        user.homeCar();
        System.out.println("Name: " + user.getName() + " age: " + user.getAge());

        User user2 = contextAnnotation.getBean("userId", User.class);
        System.out.println(user == user2);
        contextAnnotation.close();
    }
}
