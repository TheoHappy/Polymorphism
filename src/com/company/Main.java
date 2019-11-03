package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Bob", "mammal", 5, "Affenpinscher"));
        animals.add(new Dog("Doney", "mammal", 7, "Pugabull"));
        animals.add(new Lion("Simba", "mammal", 10));

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.voice();
        }
    }
}
