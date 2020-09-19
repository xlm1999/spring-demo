package com.meng.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setNane(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
