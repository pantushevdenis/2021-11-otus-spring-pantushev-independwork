package ru.pantushev.learning.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class RockMusic
        implements Music
{

    @Override
    public String getSong() {
        return "Playing Metallica";
    }
}
