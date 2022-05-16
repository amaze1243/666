package com.white;

import java.util.Objects;

public class Work01 {
    private String name;
    private int age;

    public Work01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Work01() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work01 work01 = (Work01) o;
        return age == work01.age && Objects.equals(name, work01.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Work01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
