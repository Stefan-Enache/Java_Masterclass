package com.udemy.learning_java_with_tim_buchalka;

public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private static String name;

    public SomeClass(String name) {

        classCounter++;
        this.name = name;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
