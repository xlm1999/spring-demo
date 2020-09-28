package com.meng.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Customer {
    private int custId;
    private String name;
    private int age;

    public Customer(int id, String name, int age) {
        this.custId = id;
        this.name = name;
        this.age = age;
    }
    public Customer() {
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + custId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }
}
