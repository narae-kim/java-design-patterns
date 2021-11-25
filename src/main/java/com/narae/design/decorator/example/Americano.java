package com.narae.design.decorator.example;

public class Americano extends Beverage {

    public Americano(BeverageSize beverageSize) {
        description = "Americano";
        size = beverageSize;
    }

    @Override
    public double cost() {
        double cost;
        if (getSize() == BeverageSize.TALL) {
            cost = 2.90;
        } else if (getSize() == BeverageSize.GRANDE) {
            cost = 3.10;
        } else if (getSize() == BeverageSize.VENTI) {
            cost = 3.20;
        } else {
            cost = 0.00;
        }
        return cost;
    }
}
