package ru.pantushev.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.pantushev.learning.spring.domain.Person;

@Configuration
@ComponentScan
public class Main {

    @Bean(
            initMethod = "init"
            , destroyMethod = "destroy"
    )
    public Person person ()
    {
        return new Person();
    }

    public static void main(String[] args) {
        System.out.println("learnBeanLifeCycle hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Person p1 = context.getBean("person", Person.class);
        System.out.println(p1.getString());

    }
}
