package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//
//        System.out.println("Enter your birth year: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt) {
//            int yearOFBirth = scanner.nextInt();
//            scanner.nextLine(); // Handle next line character (enter key) (name is no longer skipped when hitting enter)
//
//            System.out.println("Enter your name: ");
//                String name = scanner.nextLine();
//                int age = 2019 - yearOFBirth;
//                if (age >=0 && age <=150) {
//                System.out.println("Your name is " + name);
//                System.out.println("Your are " + age + " years young!");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        }else {
//            System.out.println("You entered letter for you year of birth");
//        }
//
//        scanner.close();


//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int sum = 0;
//
////        while (true) {
//            while (counter <10) {
//            int order = counter +1;
//            System.out.println("Enter number #"+ order + ":");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
////                if (counter == 10) {
////                    break;
////                }
//            }else {
//                System.out.println("Invalid number");
//            }
//            scanner.nextLine(); // Handle end of line Enter key
//        }
//
//        System.out.println("Sum = " + sum);
//        scanner.close();


//        Scanner scanner = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
////        boolean first = true;
//
//        while(true){
//            System.out.println("Enter number:");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt){
//                int number = scanner.nextInt();
//
////                if (first) {
////                    first = false;
////                    min = number;
////                    max = number;
////                }
//
//                if (number > max) {
//                    max = number;
//                }
//
//                if(number < min) {
//                    min = number;
//                }
//
//            } else {
//                System.out.println("Invalid input");
//                break;
//
//            }
//
//            scanner.nextLine(); // skip enter key
//        }
//
//        System.out.println("min = " + min + ", max = " + max);
//        scanner.close();

//    inputThenPrintSumAndAverage();
        getBucketCount(7.25, 4.3, 2.35);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;


        while (true) {
//            System.out.println("Enter number:");
            if (!(scanner.hasNextInt())) {
                break;
            } else {
                int number = scanner.nextInt();
                sum += number;
                scanner.nextLine();
                count++;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + (Math.round((double) sum / count)));
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double n = ((width * height) / areaPerBucket) - extraBuckets;
        int x = (int) Math.ceil(n);
        System.out.println(x);
        return x;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double n = ((width * height) / areaPerBucket);
        int x = (int) Math.ceil(n);
        System.out.println(x);
        return x;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double n = area / areaPerBucket;
        int x = (int) Math.ceil(n);
        System.out.println(x);
        return x;
    }
}
