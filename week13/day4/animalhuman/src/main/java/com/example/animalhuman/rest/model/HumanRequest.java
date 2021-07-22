package com.example.animalhuman.rest.model;

import java.util.List;

public class HumanRequest {
    private long id;
    private String name;
    private String surname;
    private int age;
    private List<Long> animalsId;

    public HumanRequest() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Long> getAnimalsId() {
        return animalsId;
    }

    public void setAnimalsId(List<Long> animalsId) {
        this.animalsId = animalsId;
    }
}
