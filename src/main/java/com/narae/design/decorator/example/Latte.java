package com.narae.design.decorator.example;

public class Latte extends Beverage {

    public Latte() {
        description = "Caffe Latte";
    }

    @Override
    public double cost() {
        return 3.50;
    }
}
