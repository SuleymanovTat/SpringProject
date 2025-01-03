package ru.suleymanovtat.model.annotation;

import org.springframework.stereotype.Component;

@Component("bmwId")
public class BMW implements Car {

    @Override
    public void run() {
        System.out.println("run BMW");
    }
}
