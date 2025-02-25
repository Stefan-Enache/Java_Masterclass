package com.pluralsight.calcengine;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguins don't fly");
    }
}
