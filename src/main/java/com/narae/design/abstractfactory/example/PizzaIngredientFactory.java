package com.narae.design.abstractfactory.example;

/**
 * The abstract PizzaIngredientFactory is the interface that defines how to make a family of related products to make a pizza.
 * For each ingredient we define a create method in our interface.
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();
}
