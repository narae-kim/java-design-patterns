package com.narae.design.compound.iteratorwithcomposite.example;

import java.util.Iterator;

/**
 * The Component interface acts as the common interface for both Menu (the composite nodes) and MenuItem (the leaf nodes) and allows us to treat them uniformly.
 * An abstract class to provide default implementations. MenuComponent provides default implementations for every method.
 * Because leaves and nodes have different roles, we cannot always define a default implementation for each method that makes sense. Sometimes the best way is throw a runtime exception.
 */
public abstract class MenuComponent {
    /**
     * The composite method.
     * The method for manipulating the components, MenuItem and Menu.
     *
     * @param component
     */
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    /**
     * The composite method.
     * The method for manipulating the components, MenuItem and Menu.
     *
     * @param component
     */
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    /**
     * The composite method.
     * The method for manipulating the components, MenuItem and Menu.
     *
     * @param ind
     */
    public MenuComponent getChild(int ind) {
        throw new UnsupportedOperationException();
    }

    /**
     * The operation method that is used by MenuItem (and Menu).
     *
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * The operation method that is used by MenuItem (and Menu).
     *
     * @return
     */
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    /**
     * The operation method that is used by MenuItem.
     *
     * @return
     */
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * The operation method that is used by MenuItem.
     *
     * @return
     */
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    /**
     * The operation method that both MenuItem and Menu implement, but we provide a default operation here.
     */
    public void print() {
        throw new UnsupportedOperationException();
    }

    /**
     * To implement a Composite iterator, add a createIterator() method in every component.
     * Calling the method on a composite should apply to all children of the composite.
     *
     * @return
     */
    public abstract Iterator createIterator();
}
