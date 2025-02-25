package com.company;

public class DeluxeBurger extends Hamburger {
//    private boolean chips;
//    private boolean drinks;
//    private int chipsPrice = 5;
//    private int drinksPrice = 5;
//
//    public DeluxeBurger(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean sauce, boolean chips, boolean drinks) {
//        super(breadRollType, meat, lettuce, tomato, carrot, sauce);
//        this.chips = chips;
//        this.drinks = drinks;
//    }
//
//    public void setChips(boolean chips) {
//        this.chips = chips;
//    }
//
//    public void setDrinks(boolean drinks) {
//        this.drinks = drinks;
//    }
//
//    public int calculatePrice (int breadPrice, int meatPrice){
//        int totalPrice = 0;
//        totalPrice += breadPrice;
//        totalPrice += meatPrice;
//        if(chips){
//            totalPrice += chipsPrice;
//        }
//        if(drinks) {
//            totalPrice += drinksPrice;
//        }
//        System.out.println(totalPrice);
//        return totalPrice;
//    }


    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }
}
