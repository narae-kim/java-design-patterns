package com.narae.design.iterator.example.javaapi;

import java.util.Iterator;

/**
 * This class knows how to iterate over an array of MenuItems.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    // position maintains the current position of the iteration over the array
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        // here the next item null indicates there are no more items
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }

    /**
     * Shift all the elements up one when remove() is called.
     */
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You cannot remove an item until you have done at least one next()");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
