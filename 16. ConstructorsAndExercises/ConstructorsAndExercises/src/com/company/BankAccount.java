package com.company;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(123, 0.0, "Unnamed", "no email", "no phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        setAccountNumber(accountNumber); // not guaranteed initialization, better for validations
        this.balance = balance; // guaranteed initialization
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(999, 0.0, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double depositAmount) {
//        Scanner scanner = new Scanner;
//        depositAmount = scanner.nextInt();
//        scanner.nextLine();
        this.balance += depositAmount;
        System.out.println("Your balance is: " + (this.balance));
    }

    public void withdrawal(double withdrawalAmount) {
//        Scanner scanner = new Scanner;
//        withdrawalAmount = scanner.nextInt();
//        scanner.nextLine();

        if (this.balance >= withdrawalAmount) {
            this.balance -= withdrawalAmount;
            System.out.println("Your balance is: " + (this.balance));
        } else {
            System.out.println("Not enough money");
        }
    }

}
