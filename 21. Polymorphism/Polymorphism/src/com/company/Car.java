package com.company;

class Car {
    public String name;
    public boolean engine;
    public int cylinders;
    public int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Engine starting";
    }

    public String accelerate() {
        return "Accelerating";
    }

    public String brake() {
        return "Stopping";
    }
}
