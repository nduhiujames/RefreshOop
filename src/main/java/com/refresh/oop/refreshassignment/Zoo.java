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

            if (animal instanceof Mammal) {
                Mammal mammal = (Mammal) animal;
                mammal.nurse();
            }

            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }

            System.out.println();
        }
    }
}