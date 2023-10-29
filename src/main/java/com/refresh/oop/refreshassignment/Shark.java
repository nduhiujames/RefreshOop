package com.refresh.oop.refreshassignment;

public class Shark extends Fish {
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes noise in the water.");
    }
}