package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount();
//        bobsAccount.setAccountNumber(12345);
//        bobsAccount.setBalance(0.0);
//        bobsAccount.setCustomerName("Bob");
//        bobsAccount.setEmail("sgsdgsg@gmail.com");
//        bobsAccount.setPhoneNumber("074324234");
//
//        bobsAccount.deposit(50);
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);


//        BankAccount stevesAccount = new BankAccount(12346, 1000.0, "Steve-O", "sdhkgsdgs@gmail.com", "075453234");
//
//        System.out.println(stevesAccount.getCustomerName());
//        BankAccount georgeAccount = new BankAccount();
//        System.out.println(georgeAccount.getAccountNumber());
//
//        BankAccount timsAccount = new BankAccount("tim", "tim@gmail", "12376575");
//        System.out.println(timsAccount.getPhoneNumber() + " " + timsAccount.getCustomerName() + timsAccount.getAccountNumber());

//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());


//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());


        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());


//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//
//

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());

    }
}
