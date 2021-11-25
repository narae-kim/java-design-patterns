package com.narae.design.decorator.example;

/**
 * Abstract Decorator class.
 * It implements the desired interface to be interchangeable with, i.e. the Beverage class.
 */
public abstract class CondimentDecorator extends Beverage {
    // An instance variable to hold the beverage we are wrapping.
    Beverage beverage;

    public abstract String getDescription();

    public BeverageSize getSize() {
        return beverage.getSize();
    }
}
