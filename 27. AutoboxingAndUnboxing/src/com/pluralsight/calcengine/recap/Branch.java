package com.pluralsight.calcengine.recap;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.customers = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) >= 0) {
            System.out.println("Customer already exists");
            return false;
        }
        this.customers.add(new Customer(customerName, initialAmount));
        return true;
    }

    public boolean addTransaction(String name, double amount) {
        int position = findCustomer(name);
        if (position < 0) {
            System.out.println("Customer not found");
            return false;
        }

//        for (int i = 0; i < customers.size(); i++) {
//            if (customers.get(i).getName().equals(name)) {
//                customers.get(i).addTransaction(amount);
//            }
//        }
        // or this
        queryCustomer(name).addTransaction(amount);
        return true;
    }


    private int findCustomer(String name) {
        return customers.indexOf(name);
    }

    private Customer queryCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }


    public void listCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("Customer: " + customers.get(i).getName() + " transactions: " + customers.get(i).getTransactions());
//            for(int j = 0; j<customers.get(i).getTransactions().size(); j++){
//                System.out.println(customers.get(i).getTransactions().get(j));
//            }
        }
    }
}
