package ru.suleymanovtat.model.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("albomId")
public class Albom {

    public Audio audio;
    public Music music;
    @Autowired
    private Video video;

    @Autowired
    public Albom(Audio audio) {
        this.audio = audio;
    }

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playVideo() {
        video.playVideo();
    }

    public void pauseVideo() {
        video.pauseVideo();
    }
}
