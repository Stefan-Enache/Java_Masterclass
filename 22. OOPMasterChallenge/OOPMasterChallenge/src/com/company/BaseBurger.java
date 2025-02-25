package com.company;

public class BaseBurger {
    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean sauce;
    public int lettucePrice = 2;
    public int tomatoPrice = 2;
    public int carrotPrice = 2;
    public int saucePrice = 2;

    public BaseBurger(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean sauce) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.sauce = sauce;
    }

    public int calculatePrice(int breadPrice, int meatPrice) {
        int totalPrice = 0;
        totalPrice += breadPrice;
        totalPrice += meatPrice;
        if (lettuce) {
            totalPrice += lettucePrice;
        }
        if (tomato) {
            totalPrice += tomatoPrice;
        }
        if (carrot) {
            totalPrice += carrotPrice;
        }
        if (sauce) {
            totalPrice += saucePrice;
        }
        System.out.println(totalPrice);
        return totalPrice;
    }

    public int getLettucePrice() {
        return lettucePrice;
    }

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getCarrotPrice() {
        return carrotPrice;
    }

    public int getSaucePrice() {
        return saucePrice;
    }
}
