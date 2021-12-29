package ru.pantushev.learn.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer2 {

    Music music;

    @Autowired
    public MusicPlayer2(ClassicalMusic music) {
        this.music = music;
    }


    public String playing()
    {
        if (music == null)
        {
            return "not music";
        }
        else {
            return music.getSong();
        }
    }

    public String getMessage()
    {
        return "hello";
    }
}
