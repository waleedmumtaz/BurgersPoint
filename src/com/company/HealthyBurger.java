package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtraOneName;
    private double healthyExtraOnePrice;

    private String healthyExtraTwoName;
    private double healthyExtraTwoPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAdditionOne(String name, double price) {
        this.healthyExtraOneName = name;
        this.healthyExtraOnePrice = price;
    }

    public void addHealthyAdditionTwo(String name, double price) {
        this.healthyExtraTwoName = name;
        this.healthyExtraTwoPrice = price;
    }
}
