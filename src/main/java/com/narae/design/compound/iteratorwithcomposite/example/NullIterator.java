package com.narae.design.compound.iteratorwithcomposite.example;

import java.util.Iterator;

/**
 * Always returns false when hasNext() is called.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
