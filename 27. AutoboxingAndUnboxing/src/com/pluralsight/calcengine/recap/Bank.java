package com.pluralsight.calcengine.recap;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.branches = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) >= 0) {
            System.out.println("branch already exists");
            return false;
        }
        branches.add(new Branch(name));
        return true;
    }

    private int findBranch(String name) {
        return branches.indexOf(name);
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        int position = findBranch(branchName);
        if (position >= 0) {
            return this.branches.get(position).newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        int position = findBranch(branchName);
        if (position >= 0) {
            /*return*/
            this.branches.get(position).addTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomer(String branchName) {
        int position = findBranch(branchName);
        if (position >= 0) {
            this.branches.get(position).listCustomers();
            return true;
        }
        return false;
    }
}
