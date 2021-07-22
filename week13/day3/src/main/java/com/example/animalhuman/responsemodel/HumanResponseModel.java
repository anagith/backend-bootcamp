package com.example.animalhuman.responsemodel;

import java.util.ArrayList;
import java.util.List;

public class HumanResponseModel {
    private long id;
    private String name;
    private String surname;
    private int age;
    private List<Long> animalsId;

    public HumanResponseModel() {
    }

    public HumanResponseModel(long id, String name, String surname, int age) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public HumanResponseModel(long id, String name, String surname, int age, ArrayList<Long> animalsId) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.animalsId = animalsId;
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
