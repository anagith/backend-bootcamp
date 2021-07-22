package com.example.animalhuman.requestmodel;

public class AnimalRequest {
    private long id;
    private String name;
    private int age;
    private long ownerId;

    public AnimalRequest() {
    }

    public AnimalRequest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AnimalRequest(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public AnimalRequest(String name, int age, long ownerId) {
        this.name = name;
        this.age = age;
        this.ownerId = ownerId;
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

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }
}
