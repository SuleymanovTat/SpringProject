package ru.suleymanovtat.model.annotation;

import org.springframework.stereotype.Component;

@Component("videoId")
public class Video {

    public void playVideo() {
        System.out.println("playVideo");
    }

    public void pauseVideo() {
        System.out.println("pauseVideo");
    }
}
