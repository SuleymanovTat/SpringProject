package ru.suleymanovtat.model.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Child {

    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
