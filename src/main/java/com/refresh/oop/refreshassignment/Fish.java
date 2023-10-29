package com.refresh.oop.refreshassignment;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
