package com.narae.design.abstractfactory.example;

/**
 * The clients of the Abstract Factory are the concrete instances of the Pizza abstract class.
 * All the concrete pizzas will derive from the abstract Pizza class.
 * The abstract class provides some basic defaults for baking, cutting and boxing.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;

    /**
     * To collect the ingredients needed for the pizza, which will come from the ingredient factory.
     */
    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 200 degree");
    }

    void cut() {
        System.out.println("Cutting the pizza into slices");
    }

    void box() {
        System.out.println("Place pizza in an official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
