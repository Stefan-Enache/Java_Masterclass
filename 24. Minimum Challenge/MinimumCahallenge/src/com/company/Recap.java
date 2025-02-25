package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Recap {



    public static void main(String[] args) {
//        int[] array1 = readElements(readInteger());
//        System.out.println(Arrays.toString(array1));
//        System.out.println(findMin(array1));
        int[] array = {0,1,2,3,4,5,6};
//        reverses(array);
        reverse(array);


    }

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }

    public static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for(int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        } return min;
    }




    //Reverse
    private static void reverses(int[] array){
        System.out.println(Arrays.toString(array));
        int end = array[array.length -1];
        int middle = array[array.length / 2];

        for(int i = 0; i < middle; i++){
            int temp = array[i];
            array[i] = end;
            end = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        System.out.println(Arrays.toString(array));
        int end = array.length - 1;

        int middle = array.length / 2;

        for (int i = 0; i < middle; i++) {
            int temp = array[i];
            array[i] = array[end - i];
            array[end - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
