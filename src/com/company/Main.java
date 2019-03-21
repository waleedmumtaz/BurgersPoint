package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.89, "White");

//        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAdditionOne("Tomato", 0.36);
        hamburger.addHamburgerAdditionTwo("Carrots", 0.41);
        hamburger.addHamburgerAdditionThree("Cucumber", 0.25);
        hamburger.addHamburgerAdditionFour("Olives", 0.40);
//        price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());
    }
}
