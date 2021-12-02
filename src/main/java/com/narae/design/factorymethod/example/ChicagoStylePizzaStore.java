package com.narae.design.factorymethod.example;

/**
 * The concrete Creator class that produces products.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } /*else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }*/ else return null;
    }
}
