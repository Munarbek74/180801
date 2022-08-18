package com.company;

public class Fish extends Animal{
    public Fish(String name, int age, int wight) {
        super(name, age, wight);
    }

    @Override
    public void uniqueness() {
        System.out.println("сууда жашайт");
    }

    @Override
    public void eats() {
        System.out.println("Атайын жемдерди жейт");
    }
}
