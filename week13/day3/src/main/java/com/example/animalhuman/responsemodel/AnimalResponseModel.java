package com.example.animalhuman.responsemodel;

public class AnimalResponseModel {
    private long id;
    private String name;
    private int age;
    private long humanId;

    public AnimalResponseModel() {
    }

    public AnimalResponseModel(long id,String name, int age, long humanId) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.humanId=humanId;
    }

    public AnimalResponseModel(long id,String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getHumanId() {
        return humanId;
    }

    public void setHumanId(long humanId) {
        this.humanId = humanId;
    }
}
