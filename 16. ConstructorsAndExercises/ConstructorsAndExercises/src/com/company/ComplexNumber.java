package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;

    }

    public void add(ComplexNumber num) {
        this.real = this.real + num.getReal();
        this.imaginary = this.imaginary + num.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;

    }

    public void subtract(ComplexNumber n) {
        this.real = this.real - n.getReal();
        this.imaginary = this.imaginary - n.getImaginary();
    }

}
