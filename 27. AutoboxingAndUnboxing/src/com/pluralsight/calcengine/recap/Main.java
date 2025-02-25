package com.pluralsight.calcengine.recap;

import com.pluralsight.calcengine.Bank;

public class Main {
    public static void main(String[] args) {
        com.pluralsight.calcengine.Bank bank = new Bank("Australia");
        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 1750.05);
        bank.addCustomer("Adelaide", "Percy", 250.05);

        bank.addBranch("Sidney");
        bank.addCustomer("Sidney", "Bob", 150.05);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.22);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.22);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sidney", true);

        bank.addBranch("mel");
        if (!bank.addCustomer("mel", "br", 55)) {
            System.out.println("Error: Invalid branch");
        }


        if (!bank.addBranch("Adelaide")) {
            System.out.println("Already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("customer does not exist");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Tim already exists");
        }
    }
}
