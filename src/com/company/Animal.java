package com.company;

public abstract class Animal {
    String nameOfTheAnimal;
    String animalGroup;
    int age;

    public Animal(String nameOfTheAnimal, String animalGroup, int age) {
        this.nameOfTheAnimal = nameOfTheAnimal;
        this.animalGroup = animalGroup;
        this.age = age;
    }

    public String getNameOfTheAnimal() {
        return nameOfTheAnimal;
    }

    public void setNameOfTheAnimal(String nameOfTheAnimal) {
        this.nameOfTheAnimal = nameOfTheAnimal;
    }

    public String getAnimalGroup() {
        return animalGroup;
    }

    public void setAnimalGroup(String animalGroup) {
        this.animalGroup = animalGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void voice();

}
