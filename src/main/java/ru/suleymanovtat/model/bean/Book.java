package ru.suleymanovtat.model.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;

public class Book {

    @Value("${user.name}")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
