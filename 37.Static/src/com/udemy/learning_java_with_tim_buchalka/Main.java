package com.udemy.learning_java_with_tim_buchalka;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance nr " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance nr " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3nd Instance");
//        System.out.println(thirdInstance.getName() + " is instance nr " + StaticTest.getNumInstances());

//        int answer = multiply(6);
//        System.out.println(answer);


        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());

//        one.instanceNumber = 4;
        System.out.println(Math.PI);
//        Math m = new Math();

        int pw = 555332;
        com.udemy.learning_java_with_tim_buchalka.Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(53325);
        password.letMeIn(555332);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
