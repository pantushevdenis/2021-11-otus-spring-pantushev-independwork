package ru.pantushev.learning.spring.dao;

import ru.pantushev.learn.spring.domain.Person;

public class PersonDaoSimple
    implements PersonDao
{
    String instanceName;

    public PersonDaoSimple(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public String getInstanceName() {
        return instanceName;
    }

    @Override
    public Person findByName(String name) {
        return new Person(name, 18, "Unknown",
                this.getClass().getName() + " " + instanceName);
    }
}
