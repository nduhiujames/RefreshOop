package com.refresh.oop.refreshassignment;

public class Zoo {
    public static void main(String[] args) {
        Lion simba = new Lion("Simba", 5);
        Parrot polly = new Parrot("Polly", 2);
        Shark jaws = new Shark("Jaws", 10);

        Animal[] zooAnimals = { simba, polly, jaws };

        for (Animal animal : zooAnimals) {
            System.out.println(animal.getName() + " is " + animal.getAge() + " years old.");
            animal.makeSound();

            if (animal instanceof Flyable) {
                Flyable flyable = (Flyable) animal;
                flyable.fly();
            }

            if (animal instanceof Swimable) {
                Swimable swimable = (Swimable) animal;
                swimable.swim();
            }

            System.out.println();
        }
    }
}