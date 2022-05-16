package com.white;

public class Person<T> {
    private String name;
    private int age;
    private T sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age, T sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public T getSex() {
        return sex;
    }

    public void setSex(T sex) {
        this.sex = sex;
    }
}
