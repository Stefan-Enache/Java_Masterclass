package com.pluralsight.calcengine;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        System.out.println("Customer already exists");
        return false;

    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCostumer = findCustomer(customerName);
        if (existingCostumer != null) {
            existingCostumer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (customerName.equals(checkedCustomer.getName())) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
