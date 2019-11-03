package com.company;

public class Lion extends Animal {
    public Lion(String nameOfTheAnimal, String animalGroup, int age) {
        super(nameOfTheAnimal, animalGroup, age);
    }

    @Override
    public void voice() {
        System.out.println("Lion roar");
    }

    @Override
    public String toString() {
        return "Name of the animal = " + nameOfTheAnimal +
                "\nAnimal group = " + animalGroup +
                "\nAge = " + age + "\n";

    }
}