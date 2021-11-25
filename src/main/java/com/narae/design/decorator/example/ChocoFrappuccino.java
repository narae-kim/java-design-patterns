package com.narae.design.decorator.example;

public class ChocoFrappuccino extends Beverage {

    public ChocoFrappuccino(BeverageSize beverageSize) {
        description = "Chocolate Frappuccino";
        size = beverageSize;
    }

    @Override
    public double cost() {
        double cost;
        if (getSize() == BeverageSize.TALL) {
            cost = 3.90;
        } else if (getSize() == BeverageSize.GRANDE) {
            cost = 4.10;
        } else if (getSize() == BeverageSize.VENTI) {
            cost = 4.30;
        } else {
            cost = 0.00;
        }
        return cost;
    }
}
