package ru.pantushev.learn.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic
    implements Music
{
    @Override
    public String getSong() {
        return "Playing Shopen";
    }
}
