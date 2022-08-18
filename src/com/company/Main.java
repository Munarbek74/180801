package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] usonAnimals = {
                new Cat("Киська", 2, 4),
                new Dog("Sharik", 4, 6),
                new Dog("Tuzik", 3, 5),
                new Horse("Molli", 8, 65),
                new Horse("Dark", 15, 96),
                new Horse("Alfa", 6, 45),
                new Horse("Betta", 9, 77),
                new Fish("Sazan", 1, 1),
                new Fish("Forel", 2, 2),
                new Cow("Burenka", 3, 65),
                new Cow("Vasia", 2, 45),
                new Cow("Marusia", 3, 70)
        };

        Animal[] asanAnimals = {
                new Cat("Киська", 2, 4),
                new Dog("Sharik", 4, 6),
                new Horse("Dolli", 10, 85),
                new Horse("Molli", 8, 65),
                new Horse("Dark", 15, 96),
                new Horse("Alfa", 6, 45),
                new Horse("Betta", 9, 77),
                new Fish("Sazan", 1, 1),
                new Fish("Forel", 2, 2),
                new Fish("Ocun", 3, 5),
                new Cow("Vasia", 2, 45),
                new Cow("Marusia", 3, 70)
        };

        Animal[] adylAnimals = {
                new Cat("Киська", 2, 4),
                new Cat("Murka", 3, 6),
                new Dog("Sharik", 4, 6),
                new Horse("Dolli", 10, 85),
                new Horse("Molli", 8, 65),
                new Horse("Dark", 15, 96),
                new Horse("Alfa", 6, 45),
                new Horse("Betta", 9, 77),
                new Horse("Gamma", 4, 35),
                new Fish("Sazan", 1, 1),
                new Fish("Forel", 2, 2),
                new Fish("Ocun", 3, 5),
                new Fish("Siga", 1, 2),
                new Fish("Seledka", 3, 5),
                new Cow("Siga", 2, 1),
                new Cow("Seledka", 3, 2)
        };

        Person person = new Person("Asan", 20, "Bishkek", asanAnimals);
        Person person1 = new Person("Uson", 19, "Osh", usonAnimals);
        Person person2 = new Person("Adyl", 25, "Batken", adylAnimals);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Бир ат жазыныз");
        if (scanner.hasNext(person.getName()))  {
            System.out.println(person);
        }
        else if (scanner.hasNext(person1.getName())) {
            System.out.println(person1);
        }
        else if (scanner.hasNext(person2.getName())) {
            System.out.println(person2);
        } else {
            System.out.println("Атты туура жазын");
        }

    }
}
