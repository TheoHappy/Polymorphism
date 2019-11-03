package com.company;

public class Dog extends Animal {
    String dogBreed;

    public Dog(String nameOfTheAnimal, String animalGroup, int age, String dogBreed) {
        super(nameOfTheAnimal, animalGroup, age);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public void voice() {
        System.out.println("Dog bark");
    }

    @Override
    public String toString() {
        return "Dog breed = " + dogBreed +
                "\nName of the animal = " + nameOfTheAnimal +
                "\nAnimal group = " + animalGroup +
                "\nAge = " + age + "\n";
    }
}
