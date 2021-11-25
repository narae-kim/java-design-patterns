package com.narae.design.decorator.example;

public class Latte extends Beverage {

    public Latte(BeverageSize beverageSize) {
        description = "Caffe Latte";
        size = beverageSize;
    }

    @Override
    public double cost() {
        double cost;
        if (getSize() == BeverageSize.TALL) {
            cost = 3.10;
        } else if (getSize() == BeverageSize.GRANDE) {
            cost = 3.30;
        } else if (getSize() == BeverageSize.VENTI) {
            cost = 3.50;
        } else {
            cost = 0.00;
        }
        return cost;
    }
}
