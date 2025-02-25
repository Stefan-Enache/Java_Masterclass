package com.udemy.learningjavawithtimbuchalka;

import org.junit.Assert;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Stefan", "Enache", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);

    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600, true);
        assertEquals(400, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_ATM() throws Exception {
        account.withdraw(600, false);
        fail("should have thrown IllegalArgumentException");

    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_True() {
        assertTrue("The account is not a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("executes after class. Count = " + count++);
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("Count = " + count++);
    }

}