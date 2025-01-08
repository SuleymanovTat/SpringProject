package ru.suleymanovtat.model.bean;

import org.springframework.beans.factory.annotation.Value;

public class Book {

    @Value("${user.name}")
    private String name;

    public String getName() {
        return name;
    }
}
