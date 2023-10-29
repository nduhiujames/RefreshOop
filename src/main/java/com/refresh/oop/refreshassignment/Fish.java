package com.refresh.oop.refreshassignment;

public class Fish extends Animal implements Swimable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes noise in the water.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

