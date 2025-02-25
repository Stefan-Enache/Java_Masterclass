package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
//        System.out.println(groceryList);
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItemNr(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItemNr(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItemNr(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItemNr(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

//    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if(position>=0){
//            return groceryList.get(position);
//        }return null;
//    }
}
