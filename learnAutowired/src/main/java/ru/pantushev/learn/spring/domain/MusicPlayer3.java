package ru.pantushev.learn.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer3 {

    ClassicalMusic music;

    public ClassicalMusic getMusic() {
        return music;
    }

    @Autowired
    public void setMusic(ClassicalMusic music) {
        this.music = music;
    }

    public String playing()
    {
        return music.getSong();


    }
}
