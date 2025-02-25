package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6 0";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new items with value set to string s
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
    }
}
