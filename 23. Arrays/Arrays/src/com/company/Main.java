package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
////	    int[] myIntArray = new int[10];
////	    myIntArray [5] = 50;
//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        double[] myDoubleArray = new double[10];
////        System.out.println(myIntArray[0]);
//
//        int[] myIntArray2 = new int[21];
//        for (int i = 1; i < myIntArray2.length; i++) {
//            myIntArray2[i] = i * 10;
//
//        }
//
////        for (int i = 1; i < myIntArray2.length; i++) {
////            System.out.println("Element: " + i + " Value: " + myIntArray2[i]);
////        }
////     printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            System.out.println("Element: " + i + " Value: " + array[i]);
//        }
//
//
//        int[] myIntegers = getIntegers(5);
//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + " value was: " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));
//
//    }
//
//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " numbers\r");
//        int[] values = new int[number];
//
//        for (int i = 0; i < values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return (double) sum / (double) array.length;

        int[] myIntegers = getInteger(5);
        int[] sorted = sortIntegers(myIntegers);
        printIntegers(sorted);
    }

    public static int[] getInteger(int number) {
        System.out.println("Enter " + number + " numbers:\r");
        int[] arrayValues = new int[number];

        for (int i = 0; i < arrayValues.length; i++) {
            arrayValues[i] = scanner.nextInt();
        }
        return arrayValues;
    }

    public static void printIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " + i + " Value: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length;i++){
//            sortedArray[i]=array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
