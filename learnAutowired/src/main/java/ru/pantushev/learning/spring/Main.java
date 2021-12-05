package ru.pantushev.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.pantushev.learning.spring.domain.MusicPlayer;

@ComponentScan
@Configuration
public class Main {
    public static void main(String[] args) {
        System.out.println("leranAutowired helloworld!");

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.getMessage());
        System.out.println(player.playing());


    }
}
