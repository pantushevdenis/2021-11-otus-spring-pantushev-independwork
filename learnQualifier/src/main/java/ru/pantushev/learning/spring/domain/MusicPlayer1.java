package ru.pantushev.learning.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer1 {

    @Autowired
    @Qualifier("classicalMusic")
    Music music;

    public String playing()
    {
        return music.getSong();
    }

}
