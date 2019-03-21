package com.company;

// This Hamburger class is the base class
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    //    Lines 11 through 21 are the additional items a customer wants to add to their basic hamburger
    private String additionOneName;
    private double additionOnePrice;

    private String additionTwoName;
    private double additionTwoPrice;

    private String additionThreeName;
    private double additionThreePrice;

    private String additionFourName;
    private double additionFourPrice;

    // Constructor for the fields of this class
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    // Adding name and price for AdditionOne to the Hamburger
    public void addHamburgerAdditionOne(String name, double price) {
        this.additionOneName = name;
        this.additionOnePrice = price;
    }

    // Adding name and price for AdditionTwo to the Hamburger
    public void addHamburgerAdditionTwo(String name, double price) {
        this.additionTwoName = name;
        this.additionTwoPrice = price;
    }

    // Adding name and price for AdditionThree to the Hamburger
    public void addHamburgerAdditionThree(String name, double price) {
        this.additionThreeName = name;
        this.additionThreePrice = price;
    }

    // Adding name and price for AdditionFour to the Hamburger
    public void addHamburgerAdditionFour(String name, double price) {
        this.additionFourName = name;
        this.additionFourPrice = price;
    }

    // Calculating the final price after adding the additional items to the Hamburger
    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.additionOneName != null) {
            hamburgerPrice += this.additionOnePrice;
            System.out.println("Added " + this.additionOneName + " for an extra " + this.additionOnePrice);
        }

        if (this.additionTwoName != null) {
            hamburgerPrice += this.additionTwoPrice;
            System.out.println("Added " + this.additionTwoName + " for an extra " + this.additionTwoPrice);
        }

        if (this.additionThreeName != null) {
            hamburgerPrice += this.additionThreePrice;
            System.out.println("Added " + this.additionThreeName + " for an extra " + this.additionThreePrice);
        }

        if (this.additionFourName != null) {
            hamburgerPrice += this.additionFourPrice;
            System.out.println("Added " + this.additionFourName + " for an extra " + this.additionFourPrice);
        }

        return hamburgerPrice;
    }
}
