package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 15.15, "White");
        super.addHamburgerAdditionOne("Chips", 2.05);
        super.addHamburgerAdditionTwo("Drink", 3.25);
    }

    @Override
    public void addHamburgerAdditionOne(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionTwo(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionThree(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionFour(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
