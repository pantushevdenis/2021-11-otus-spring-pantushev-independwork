package ru.pantushev.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.pantushev.learning.spring.domain.MusicPlayer1;
import ru.pantushev.learning.spring.domain.MusicPlayer2;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        System.out.println("learnQualifier  hello world");

        ApplicationContext c = new AnnotationConfigApplicationContext(Main.class);

        MusicPlayer1 mp1 = c.getBean("musicPlayer1", MusicPlayer1.class);
        System.out.println("mp1: " + mp1.playing());

        MusicPlayer2 mp2 = c.getBean("musicPlayer2", MusicPlayer2.class);
        System.out.println("mp2: " + mp2.playing());

        //MusicPlayer3 mp3 = c.getBean("musicPlayer3", MusicPlayer3.class);
        //System.out.println("mp3: " + mp3.playing());



    }

}
