package com.narae.design.abstractfactory.example;

/**
 * Each factory knows how to create the right objects for their region.
 * Each factory produces a different implementation for the family of products.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() { return new PlumTomatoSauce(); }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    /**
     * The hardcoded veggies to keep it simple for the example.
     *
     * @return
     */
    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
