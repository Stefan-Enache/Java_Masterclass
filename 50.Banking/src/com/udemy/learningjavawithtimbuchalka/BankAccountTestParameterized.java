package com.udemy.learningjavawithtimbuchalka;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

    private BankAccount account;

    private double amount;
    private boolean branch;
    private double expectedAmount;

    public BankAccountTestParameterized(double amount, boolean branch, double expectedAmount) {
        this.amount = amount;
        this.branch = branch;
        this.expectedAmount = expectedAmount;
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Stefan", "Enache", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {1000.00, true, 2000.00}
        });
    }

    @org.junit.Test
    public void deposit() throws Exception {
        account.deposit(amount, branch);
        assertEquals(expectedAmount, account.getBalance(), .01);
    }
}
