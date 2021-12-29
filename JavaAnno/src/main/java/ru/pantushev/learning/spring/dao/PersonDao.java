package ru.pantushev.learning.spring.dao;

import ru.pantushev.learn.spring.domain.Person;

public interface PersonDao {
    Person findByName(String name);
    String getInstanceName();
}
