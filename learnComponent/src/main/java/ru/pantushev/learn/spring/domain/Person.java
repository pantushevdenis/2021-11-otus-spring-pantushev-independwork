package ru.pantushev.learn.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class Person {
    public String getString ()
    {
        return "This is person";
    }
}
