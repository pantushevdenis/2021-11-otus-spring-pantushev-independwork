package ru.pantushev.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.pantushev.learning.spring.domain.MusicPlayer;

import javax.naming.Context;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        System.out.println("learnValue hello world");

        ApplicationContext c = new AnnotationConfigApplicationContext(Main.class);

        MusicPlayer mp1 = c.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("mp1");
        System.out.println("name: " + mp1.getName());
        System.out.println("volume: " + mp1.getVolume());
        System.out.println();
    }
}
