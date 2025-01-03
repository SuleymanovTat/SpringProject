package ru.suleymanovtat.model;

import org.springframework.stereotype.Component;

@Component
public class Audio {

    public void play() {
        System.out.println("Audio play");
    }

    public void pause() {
        System.out.println("Audio pause");
    }
}
