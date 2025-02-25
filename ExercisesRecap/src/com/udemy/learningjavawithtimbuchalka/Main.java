package com.udemy.learningjavawithtimbuchalka;

import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(sortIntegers(array));

    }

    public static int[] getIntegers(int number) {
        scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " numbers:\r");
        int[] arrayValues = new int[number];

        for (int i = 0; i < arrayValues.length; i++) {
            arrayValues[i] = scanner.nextInt();
        }
        return arrayValues;
    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element: " + i + " Value: " + sortedArray[i]);
        }
    }


//    public static int[] sortInteger(int[] array){
//        boolean flag = true;
//        int temp;
//
//        while(flag){
//            flag = false;
//            for(int i = 0; i < array.length -1; i++){
//                if(array[i] < array[i+1]) {
//                     temp = array[i];
//                     array[i] = array[i+1];
//                     array[i+1] = temp;
//                     flag = true;
//                }
//            }
//        }
//        return array;
//    }


    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
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
