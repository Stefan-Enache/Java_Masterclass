package com.company;

public class HealthyBurger extends Hamburger {
//    private boolean avocado;
//    private boolean pepper;
//    private int avocadoPrice = 3;
//    private int pepperPrice = 3;
//
//    public HealthyBurger(boolean lettuce, boolean tomato, boolean carrot, boolean sauce, boolean avocado, boolean pepper) {
//        super("Brown rye", "Soy", lettuce, tomato, carrot, sauce);
//        this.avocado = avocado;
//        this.pepper = pepper;
//    }
//
//    public void setAvocado(boolean avocado) {
//        this.avocado = avocado;
//    }
//
//    public void setPepper(boolean pepper) {
//        this.pepper = pepper;
//    }
//
//    @Override
//    public int calculatePrice(int breadPrice, int meatPrice) {
//        int totalPrice = 0;
//        totalPrice += breadPrice;
//        totalPrice += meatPrice;
//        if(avocado){
//            totalPrice += this.avocadoPrice;
//        }
//        if(pepper) {
//            totalPrice += this.pepperPrice;
//        }
//        System.out.println(totalPrice);
//        return totalPrice;
//}

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}


