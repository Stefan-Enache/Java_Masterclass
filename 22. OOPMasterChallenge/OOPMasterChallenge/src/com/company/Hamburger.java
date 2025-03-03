package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ". Price is " + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + addition4Price);
        }
        return hamburgerPrice;
    }
}
