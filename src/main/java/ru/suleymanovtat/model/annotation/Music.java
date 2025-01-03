package ru.suleymanovtat.model.annotation;

import org.springframework.stereotype.Component;

@Component("musicId")
public class Music {

    public void play() {
        System.out.println("Music play");
    }

    public void pause() {
        System.out.println("Music pause");
    }
}
