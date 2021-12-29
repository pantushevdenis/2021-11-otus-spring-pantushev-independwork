package ru.pantushev.learning.spring.dao;

import ru.pantushev.learning.spring.domain.Person;

public class PersonDaoMale
    implements PersonDao
{
    String instanceName;

    public PersonDaoMale(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public String getInstanceName() {
        return instanceName;
    }

    @Override
    public Person findByName(String name) {
        return new Person(name, 16, "male",
                this.getClass().getName() + " " + getInstanceName());
    }
}
