package com.narae.design.decorator.example;

/**
 * Abstract Component.
 */
public abstract class Beverage {
    // The description instance variable is set in each subclasses and holds a description of the beverage.
    String description = "Beverage";
    BeverageSize size;

    public BeverageSize getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
