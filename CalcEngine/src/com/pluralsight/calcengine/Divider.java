package com.pluralsight.calcengine;

public class Divider extends CalculateBase {

    public Divider() {
    }

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getRightVal() != 0 ? getLeftVal() / getRightVal() : 0;
        setResult(value);
    }
}
