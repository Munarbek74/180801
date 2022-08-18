package com.company;

public class Dog extends Animal{
    public Dog(String name, int age, int wight) {
        super(name, age, wight);
    }

    @Override
    public void uniqueness() {
        System.out.println("Кинолог болушат");
    }

    @Override
    public void eats() {
        System.out.println("Соок гажыйт");
    }
}
