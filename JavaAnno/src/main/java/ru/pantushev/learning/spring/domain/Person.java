package ru.pantushev.learning.spring.domain;

public class Person {
    String name;
    int age;
    String gender;
    String fromService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFromService() {
        return fromService;
    }

    public void setFromService(String fromService) {
        this.fromService = fromService;
    }

    public Person(String name, int age, String gender, String fromService) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.fromService = fromService;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", fromService='" + fromService + '\'' +
                '}';
    }
}
