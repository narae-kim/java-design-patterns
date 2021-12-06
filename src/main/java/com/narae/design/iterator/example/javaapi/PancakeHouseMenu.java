package com.narae.design.iterator.example.javaapi;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Each concrete Menu is responsible for creating the appropriate concrete Iterator class.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("Narae's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 8.99);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", false, 8.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 7.99);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 8.50);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /* NOT WANTED - it exposes the internal implementation
    public ArrayList getMenuItems() {
        return menuItems;
    }
     */

    /**
     * Call the iterator() method on the menuItems ArrayList
     *
     * @return Iterator
     */
    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
