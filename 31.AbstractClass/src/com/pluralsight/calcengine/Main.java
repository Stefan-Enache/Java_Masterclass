package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot bird = new Parrot("Polly");
        bird.breathe();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Imperial P");
        penguin.fly();

    }

}
