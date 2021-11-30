package ru.pantushev.learning.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.pantushev.learning.spring.dao.PersonDao;
import ru.pantushev.learning.spring.dao.PersonDaoFemale;
import ru.pantushev.learning.spring.dao.PersonDaoMale;
import ru.pantushev.learning.spring.dao.PersonDaoSimple;
import ru.pantushev.learning.spring.service.PersonService;
import ru.pantushev.learning.spring.service.PersonServiceImpl;

@Configuration
public class ApplicationConfig {
    @Bean
    public PersonDaoSimple personDaoSimple()
    {
        return new PersonDaoSimple("simple");
    }

    @Bean
    public PersonDaoMale male1()
    {
        return new PersonDaoMale("male1");
    }

    @Bean
    public PersonDaoFemale female1()
    {
        return new PersonDaoFemale("female1");
    }

    @Bean
    public PersonDaoFemale female2()
    {
        return new PersonDaoFemale("female2");
    }

    @Bean
    public PersonService personService1(PersonDaoSimple dao) {
        return new PersonServiceImpl("service1", dao);
    }

    @Bean
    public PersonService personService2male(PersonDaoMale dao) {
        return new PersonServiceImpl("service2male", dao);
    }

    @Bean
    public PersonService personService3female1(PersonDaoFemale female1)
    {
        return new PersonServiceImpl("personService3female1", female1);
    }

    @Bean
    public PersonService personService4female2(PersonDaoFemale female2)
    {
        return new PersonServiceImpl("personService4female2", female2);
    }



}
