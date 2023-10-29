package com.refresh.oop.refreshassignment;

public class Parrot extends Bird implements Flyable {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawks.");
    }
    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}
