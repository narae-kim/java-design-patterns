package com.narae.design.decorator.example;

public class DecafAmericano extends Beverage {
    public DecafAmericano() {
        description = "Decaffeinated Americano";
    }

    @Override
    public double cost() {
        return 3.40;
    }
}
