package ru.pantushev.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.pantushev.learn.spring.domain.MusicPlayer1;
import ru.pantushev.learn.spring.domain.MusicPlayer2;
import ru.pantushev.learn.spring.domain.MusicPlayer3;

@ComponentScan
@Configuration
public class Main {
    public static void main(String[] args) {
        System.out.println("leranAutowired helloworld!");

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        MusicPlayer1 player1 = context.getBean("musicPlayer1", MusicPlayer1.class);
        System.out.println("player1: " + player1.playing());

        MusicPlayer2 player2 = context.getBean("musicPlayer2", MusicPlayer2.class);
        System.out.println("player2: " + player2.playing());

        MusicPlayer3 player3 = context.getBean("musicPlayer3", MusicPlayer3.class);
        System.out.println("player3: " + player3.playing());


    }
}
