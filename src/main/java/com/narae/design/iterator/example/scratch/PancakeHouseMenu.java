package com.narae.design.iterator.example.scratch;

import java.util.ArrayList;

/**
 * Each concrete Menu is responsible for creating the appropriate concrete Iterator class.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

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
     * The client does not need to know how the menuItems are maintained in the PancakeHouseMenu, nor does it need to know how the PancakeHouseIterator is implemented.
     *
     * @return Iterator
     */
    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
