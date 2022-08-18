package com.company;

public class Horse extends Animal{


    public Horse(String name, int age, int wight) {
        super(name, age, wight);
    }

    @Override
    public void uniqueness() {
        System.out.println("Бат чуркайт");
    }

    @Override
    public void eats() {
        System.out.println("Алма жейт");
    }
}
