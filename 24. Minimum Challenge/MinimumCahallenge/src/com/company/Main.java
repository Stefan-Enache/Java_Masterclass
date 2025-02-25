package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
// MIN CHALLENGE
//        System.out.println("Enter count: ");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//
//        int[] returnedArray = readIntegers(count);
//
//        int returnedMin = findMin(returnedArray);
//
//        System.out.println("Min = " + returnedMin);
//
//    }
//
//    private static int[] readIntegers(int count){
//        int[] array = new int[count];
//        for(int i=0; i<array.length; i++) {
//            System.out.println("Enter numbers: \r");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            array[i] = number;
//        } return array;5
//    }
//
//    private static int findMin(int[] array) {
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<array.length; i++) {
//            int value = array[i];
//            if (value < min) {
//                min = value;
//            }
//        }
//        return min;

//        REVERSE ARRAY

        int[] array = {1,5,3,7,11,9,15};

        System.out.println("Array = " + Arrays.toString(array));
reverse(array);
        System.out.println("Reversed = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;
        for(int i=0; i<  halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;

        }
    }
}
