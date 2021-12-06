package com.narae.design.iterator.example.scratch;

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
}
