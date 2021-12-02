package com.narae.design.factorymethod.example.simplefactory;

import java.util.ArrayList;

/**
 * This is the product of the factory.
 * All the concrete pizzas will derive from the abstract Pizza class.
 * The abstract class provides some basic defaults for baking, cutting and boxing.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings -");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("\t\t" + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 200 degree");
    }

    void cut() {
        System.out.println("Cutting the pizza into slices");
    }

    void box() {
        System.out.println("Place pizza in an official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
