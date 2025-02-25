package com.company;

class Nissan extends Car {
    public Nissan(String name, int cylinder) {
        super("Nissan", cylinder);
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
        return "Nissan starting";
    }

    @Override
    public String accelerate() {
        return "Nissan accelerating";
    }

    @Override
    public String brake() {
        return "Nissan stopping";
    }
}