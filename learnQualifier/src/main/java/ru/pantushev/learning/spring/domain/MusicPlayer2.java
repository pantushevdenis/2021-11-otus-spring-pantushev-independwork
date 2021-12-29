package ru.pantushev.learning.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer2 {

    @Autowired
    Music classicalMusic;

    public String playing()
    {
        return classicalMusic.getSong();
    }

}
