package com.narae.design.factorymethod.example;

/**
 * The Creator class.
 * A subclass for each regional type implements PizzaStore and each subclass is going to make the decision about what makes up a pizza, e.g. NYStylePizzaStore, ChicagoStylePizzaStore.
 * Often the creator contains code that depends on an abstract product, which is produced by a subclass. The creator never really knows which concrete product was produced.
 */
public abstract class PizzaStore {
    /**
     * The subclasses of PizzaStore handle object instantiation for us in the createPizza() method.
     * Make the orderPizza() method 'final' if we really wanted to enforce this.
     *
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

        // Delegating a factory
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * "Factory method": Encapsulating object creation.
     * All the responsibility for instantiating Pizzas has been moved into a method that acts as a factory.
     * Each subclass of PizzaStore defines what the createPizza() method looks like.
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
