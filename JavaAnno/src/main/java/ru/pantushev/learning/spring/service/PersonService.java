package ru.pantushev.learning.spring.service;

import ru.pantushev.learning.spring.domain.Person;

public interface PersonService {
    String getServiceName();
    Person getByName(String name);
}
