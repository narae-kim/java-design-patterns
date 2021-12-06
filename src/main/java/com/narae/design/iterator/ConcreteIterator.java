package com.narae.design.iterator;

/**
 * The ConcreteIterator is responsible for managing the current position of the iteration.
 */
public class ConcreteIterator implements Iterator {
    SomeCollection collection;

    public ConcreteIterator(SomeCollection collection) {
        this.collection = collection;
    }

    /**
     * TODO - Override a proper implementation.
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return false;
    }

    /**
     * TODO - Override a proper implementation.
     *
     * @return
     */
    @Override
    public Object next() {
        return null;
    }

    /**
     * TODO - Override a proper implementation.
     */
    @Override
    public void remove() {
        //
    }
}
