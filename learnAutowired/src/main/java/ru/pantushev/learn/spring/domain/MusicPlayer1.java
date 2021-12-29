package ru.pantushev.learn.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer1 {

    @Autowired
    ClassicalMusic music;

    public String playing()
    {
        return music.getSong();
    }

}
