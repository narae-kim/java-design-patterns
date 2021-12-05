package com.narae.design.templatemethod.example;

public abstract class CaffeineBeverage {
    /**
     * The Template Method.
     * It serves as a template for an algorithm, i.e., an algorithm for making caffeinated beverages.
     * It generalises the recipe and places it in the base class to handle some of the steps required different implementations where the subclasses implement.
     * In the template, each step of the algorithm is represented by a method.
     * The same method will be used to make different beverage types.
     * "final" access to prevent the subclasses to override the method and change the recipe.
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * Each subclass handles the method in different ways.
     */
    public abstract void brew();

    /**
     * Each subclass handles the method in different ways.
     */
    public abstract void addCondiments();

    /**
     * Shared method by subclasses.
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Shared method by subclasses.
     */
    public void pourInCup() {
        System.out.println("Pour into cup");
    }

    /**
     * Hook method.
     * The subclasses can override the method but they do not have to.
     * Mostly defined with an empty default implementation.
     *
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
