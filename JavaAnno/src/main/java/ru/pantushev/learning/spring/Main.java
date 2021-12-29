package ru.pantushev.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.pantushev.learning.spring.config.ApplicationConfig;
import ru.pantushev.learning.spring.config.DaoConfig;
import ru.pantushev.learning.spring.domain.Person;
import ru.pantushev.learning.spring.service.PersonService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class, DaoConfig.class);

        PersonService ps1 = context.getBean("personService1", PersonService.class);
        System.out.println(ps1.getServiceName());
        Person p1 = ps1.getByName("name1");
        System.out.println(p1);


        PersonService ps2 = context.getBean("personService2male", PersonService.class);
        System.out.println(ps2.getServiceName());
        Person p2 = ps2.getByName("name2");
        System.out.println(p2);


        PersonService ps3 = context.getBean("personService3female1", PersonService.class);
        System.out.println(ps3.getServiceName());
        Person p3 = ps3.getByName("name3");
        System.out.println(p3);

        PersonService ps4 = context.getBean("personService4female2", PersonService.class);
        System.out.println(ps4.getServiceName());
        Person p4 = ps4.getByName("name4");
        System.out.println(p4);



    }
}
