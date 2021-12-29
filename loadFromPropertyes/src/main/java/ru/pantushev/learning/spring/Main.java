package ru.pantushev.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.pantushev.learning.spring.domain.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("name = " + mp.getName());
        System.out.println("voluem = " + mp.getVolume());
    }
}
