package com.company;

class Subaru extends Car {
    public Subaru(String name, int cylinder) {
        super("Subaru", cylinder);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public int getCylinders() {
        return super.getCylinders();
    }


    @Override
    public String startEngine() {
        return "Subaru starting";
    }

    @Override
    public String accelerate() {
        return "Subaru accelerating";
    }

    @Override
    public String brake() {
        return ("Subaru stopping");
    }
}