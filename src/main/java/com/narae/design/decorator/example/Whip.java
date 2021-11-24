package com.narae.design.decorator.example;

/**
 * Whip is a decorator so it extends CondimentDecorator which extends Beverage.
 */
public class Whip extends CondimentDecorator {
    // An instance variable to hold the beverage we are wrapping.
    Beverage beverage;

    // Set the reference to a Beverage to hold the beverage we are wrapping.
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * we first delegate to the object we are decorating to get its description, then append “, Whip” to that description.
     *
     * @return description
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    /**
     * We delegate the call to the object we’re decorating, so that it can compute the cost.
     * Then, we add the cost of Whip to the result.
     *
     * @return cost
     */
    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
