package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRecap {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryListRecap groceryList = new GroceryListRecap();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
//        ArrayList<String> newArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] array = new String[groceryList.getGroceryList().size()];
        array = groceryList.getGroceryList().toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Print Choice");
        System.out.println("\t 1 - Print List");
        System.out.println("\t 2 - Add");
        System.out.println("\t 3 - Modify");
        System.out.println("\t 4 - Remove");
        System.out.println("\t 5 - Search");
        System.out.println("\t 6 - Quit");
    }

    public static void addItem() {
        System.out.print("Please enter item: ");
        groceryList.addItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter old item: ");
        String item = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter Item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter item: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " not in list");
        }
    }


}
