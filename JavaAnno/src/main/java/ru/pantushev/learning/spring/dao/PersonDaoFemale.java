package ru.pantushev.learning.spring.dao;

import ru.pantushev.learn.spring.domain.Person;

public class PersonDaoFemale
    implements PersonDao
{
    String instanceName;

    public PersonDaoFemale(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public String getInstanceName() {
        return instanceName;
    }

    @Override
    public Person findByName(String name) {
        return new Person(name, 13, "female",
                this.getClass().getName() + " " + getInstanceName());
    }
}
