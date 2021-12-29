package ru.pantushev.learning.spring.service;

import ru.pantushev.learning.spring.dao.PersonDao;
import ru.pantushev.learning.spring.domain.Person;

public class PersonServiceImpl
    implements PersonService
{
    String serviceName;
    PersonDao dao;

    public PersonServiceImpl(String serviceName, PersonDao dao) {
        this.serviceName = serviceName;
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }
}
