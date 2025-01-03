package ru.suleymanovtat.model.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userId")
public class User {

    @Value("ilmir")
    private String name;
    @Value("${user.age}")
    private int age;


    private final Car car;
    private Car homeCar;

    @Autowired
    public User(@Qualifier("bmwId") Car car) {
        this.car = car;
    }

    public void runCar() {
        car.run();
    }

    @Autowired
    @Qualifier("ladaId")
    public void setLada(Car car) {
        System.out.println("LADA:");
        car.run();
        homeCar = car;
    }

    public void homeCar() {
        System.out.println("homeCar:");
        homeCar.run();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
