package com.narae.design.decorator.example;

/**
 * Milk is a decorator so it extends CondimentDecorator which extends Beverage.
 */
public class Milk extends CondimentDecorator {
    // An instance variable to hold the beverage we are wrapping.
    Beverage beverage;

    // Set the reference to a Beverage to hold the beverage we are wrapping.
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * we first delegate to the object we are decorating to get its description, then append “, Milk” to that description.
     *
     * @return description
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * We delegate the call to the object we’re decorating, so that it can compute the cost.
     * Milk is free to add in this cafe.
     *
     * @return cost
     */
    @Override
    public double cost() {
        return beverage.cost();
    }
}
