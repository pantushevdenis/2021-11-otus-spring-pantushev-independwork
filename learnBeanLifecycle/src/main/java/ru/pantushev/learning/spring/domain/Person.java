package ru.pantushev.learning.spring.domain;

import org.springframework.stereotype.Component;

@Component()
public class Person {
    public String getString ()
    {
        return "This is person";
    }


    public void init()
    {
        System.out.println("init person  bean");
    }

    public void destroy()
    {
        System.out.println("destroy person bean");
    }
}
