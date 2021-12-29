package ru.pantushev.learn.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer3 {

    Music music;

    @Autowired
    public void setMusic(Music classicalMusic) { //не работает
        this.music = music;
    }

    public String playing()
    {
        return music.getSong();
    }

}
