package ru.suleymanovtat.model.annotation;

import org.springframework.stereotype.Component;

@Component("ladaId")
public class LADA implements Car {
    @Override
    public void run() {
        System.out.println("run LADA");
    }
}
