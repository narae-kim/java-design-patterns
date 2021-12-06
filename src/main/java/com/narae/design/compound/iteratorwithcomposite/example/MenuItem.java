package com.narae.design.compound.iteratorwithcomposite.example;

import java.util.Iterator;

/**
 * The Leaf class in the Composite diagram and it implements the behavior of the elements of the composite.
 * MenuItem overrides the methods that make sense, and uses the default implementations in MenuComponent for those that do not make sense.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print("\t" + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("\t\t-- " + getDescription());
    }

    /**
     * One other option is just to return null, but then we need conditional code in the client to see if null was returned or not.
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
