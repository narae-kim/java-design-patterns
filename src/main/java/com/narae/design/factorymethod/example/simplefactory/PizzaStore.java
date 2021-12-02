package com.narae.design.factorymethod.example.simplefactory;

/**
 * This is the client of the factory. PizzaStore now goes through the SimplePizzaFactory to get instances of pizza.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /**
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        /* Comparison with createPizza(type): not closed for modification
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } */

        // Uses the factory to create its pizzas by simply passing on the type of the order.
        // This replaces the "new" operator with a create method on the factory object.
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
