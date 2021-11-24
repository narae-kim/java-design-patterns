package com.narae.design.decorator.example;

public class ChocoFrappuccino extends Beverage {
    public ChocoFrappuccino() {
        description = "Chocolate Frappuccino";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
