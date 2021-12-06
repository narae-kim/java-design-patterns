package com.narae.design.iterator;

/**
 * The Iterator interface from scratch or java.util.Iterator.
 * The Iterator interface provides the interface that all iterators must implement, and a set of methods for traversing over elements of a collection.
 */
public interface Iterator {
    boolean hasNext();

    Object next();

    void remove();
}
