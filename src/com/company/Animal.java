package com.company;

public abstract class Animal {

    private String name;
    private int age;
    private int wight;

    public Animal(String name, int age, int wight) {
        this.name = name;
        this.age = age;
        this.wight = wight;
    }

    public abstract void uniqueness();

    public abstract void eats();

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

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wight=" + wight +
                '}';
    }
}
