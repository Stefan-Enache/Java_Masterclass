package com.company;

class Porsche extends Car {

    public Porsche(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting";
    }

    @Override
    public String accelerate() {
        return "Porsche accelerating";
    }

    @Override
    public String brake() {
        return "Porsche stopping";
    }
}