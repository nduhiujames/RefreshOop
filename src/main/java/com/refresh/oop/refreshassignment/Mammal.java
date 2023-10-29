package com.refresh.oop.refreshassignment;

public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void nurse() {
        System.out.println(getName() + " is nursing.");
    }

}
