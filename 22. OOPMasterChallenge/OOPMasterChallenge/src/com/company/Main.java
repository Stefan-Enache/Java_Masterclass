package com.company;

public class Main {

    public static void main(String[] args) {
//        BaseBurger burger = new BaseBurger("white", "beef", true, false, false, false);
//        burger.calculatePrice(1, 6);
//        HealthyBurger healthyBurger = new HealthyBurger(true, true, false, false, true, true);
//        healthyBurger.calculatePrice(2, 4);
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Soy", 5.67);
        healthyBurger.addHamburgerAddition1("egg", 5.43);

        healthyBurger.addHealthyAddition1("lentils", 3.41);
        System.out.println("Total burger price is " + healthyBurger.itemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Error", 50);
        System.out.println("Total burger price is " + db.itemizeHamburger());
    }
}
