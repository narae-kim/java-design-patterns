package com.narae.design.factorymethod.example.simplefactory;

/**
 * This is the factory where we create pizzas for its clients.
 * It should be the only part of our application that refers to concrete Pizza classes.
 * By encapsulating the pizza creating in one class, we now have only one place to make modifications when the implementation changes.
 * Also, it removes the concrete instantiations from the client code.
 */
public class SimplePizzaFactory {
    /**
     * This is the method all clients will use to instantiate new objects.
     * The code is still parameterized by the type of the pizza.
     * The create method is often declared statically.
     *
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
