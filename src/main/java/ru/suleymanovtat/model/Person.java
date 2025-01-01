package ru.suleymanovtat.model;

public class Person {

    private final Dog dog;

    public Person(Dog dog) {
        this.dog = dog;
    }

    public void animalName() {
        dog.name();
    }
}
