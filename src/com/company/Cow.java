package com.company;

public class Cow extends Animal{
    public Cow(String name, int age, int wight) {
        super(name, age, wight);
    }

    @Override
    public void uniqueness() {
        System.out.println("Сут берет");
    }

    @Override
    public void eats() {
        System.out.println("Чоп жейт");
    }
}
