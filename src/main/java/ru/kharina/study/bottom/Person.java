package ru.kharina.study.bottom;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Person {
    private String name;
    private int age;

    public void setNameAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }

}

