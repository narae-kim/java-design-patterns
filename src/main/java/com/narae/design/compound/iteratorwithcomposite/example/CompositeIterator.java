package com.narae.design.compound.iteratorwithcomposite.example;

import java.util.Iterator;
import java.util.Stack;

/**
 * An external iterator - a lot more to keep track of than an internal iterator.
 * The job of iterating over the menu items in the component, and of making sure all the child menus are included.
 */
public class CompositeIterator implements Iterator {
    // Stack to maintain the position in the iteration over a composite recursive structure as we move up and down the composite hierarchy.
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    /**
     * The iterator of the top-level composite we are going to iterate over is passed in.
     *
     * @param iterator
     */
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public Object next() {
        // If there is a next element, we get the current iterator off the stack and get its next element.
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            // If that element is a menu, we have another composite that needs to be included in the iteration, so we throw it on the stack.
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            // Get the iterator off the top of the stack and see if it has a next element.
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                // If there is no next element, we pop it off the stack and call hasNext() recursively.
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
