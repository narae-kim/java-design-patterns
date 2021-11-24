package com.narae.design.decorator.example;

public class Americano extends Beverage {
    public Americano() {
        description = "Americano";
    }

    @Override
    public double cost() {
        return 3.10;
    }
}
