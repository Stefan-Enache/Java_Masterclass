package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println(number);

        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString);
        System.out.println(number);

        System.out.println("-----------------");
        canPack(2, 2, 12);
        getLargestPrime(45);
        printSquareStar(10);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal < 0) {
            System.out.println("false");
            return false;
        }
        int sumBig = bigCount * 5;

        if (sumBig + smallCount < goal) {
            System.out.println("False");
            return false;
        }
        if (goal % 5 > smallCount) {
            System.out.println("fAlse");
            return false;

        }
        System.out.println("true");
        return true;
    }

    public static int getLargestPrime(int n) {
        if (n <= 1) {
            return -1;
        }
        for (int i = 2; n > i; i++) {
            if (n % i == 0) {
                n /= i;
                i--;
            }
        }
        System.out.println(n);
        return n;
    }

    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= n; row++) {
                for (int column = 1; column <= n; column++) {
                    if (row == 1 || row == n || column == 1 || column == n || row == column || column == n - row + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

}
