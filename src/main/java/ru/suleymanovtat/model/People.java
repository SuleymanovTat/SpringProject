package ru.suleymanovtat.model;

public class People {

    Dog dog;

    public void setAnimal(Dog dog) {
        this.dog = dog;
    }

    public void name() {
        System.out.println("People ");
        dog.name();
    }
}
