package com.narae.design.factorymethod;

/**
 * The Creator is a class that contains the implementations for all of the methods to manipulate products, except for the factory method.
 */
public abstract class Creator {
    /**
     * The abstract factoryMethod() is what all Creator subclasses must implement.
     * A factory method handles object creation and encapsulates it in a subclass. This decouples the client code in the superclass from the object creation code in the subclass.
     * A factory method isolates the client (the code in the superclass, like orderPizza()) from knowing what kind of concrete Product is actually created.
     *
     * @param type (A factory method may be parameterized to select among several variations of a product.)
     * @return a Product that is typically used within methods defined in the superclass.
     */
    abstract Product factoryMethod(String type);

    void anOperation() {
    }

}
