package com.company;

public class Cat extends Animal{

    public Cat(String name, int age, int wight) {
        super(name, age, wight);
    }

    @Override
    public void uniqueness() {
        System.out.println("Козу куйот");
    }

    @Override
    public void eats() {
        System.out.println("Балык жейт");

    }


}
