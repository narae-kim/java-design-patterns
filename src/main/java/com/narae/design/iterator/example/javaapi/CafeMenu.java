package com.narae.design.iterator.example.javaapi;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Each concrete Menu is responsible for creating the appropriate concrete Iterator class.
 */
public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 7.99);
        addItem("Soup of the day", "A cup of the soup of the day with a side salad", false, 3.99);
        addItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 8.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

     /* NOT WANTED - it exposes the internal implementation
    public Hashtable getMenuItems() {
        return menuItems;
    }
      */

    /**
     * The values of the Hashtable, menuItems.values(), is a collection of all objects in the hashtable.
     * The collection supports the iterator() method which returns an object of type java.util.Iterator.
     *
     * @return Iterator
     */
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
