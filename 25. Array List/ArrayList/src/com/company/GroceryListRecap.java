package com.company;

import java.util.ArrayList;

public class GroceryListRecap {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items");
        System.out.println(groceryList);
    }

    public void modifyGroceryItem(String item, String newItem) {
        int position = findItem(item);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Item at " + (position + 1) + " modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item: " + (theItem) + " removed");
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
//       boolean exists = groceryList.contains(searchItem);
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
