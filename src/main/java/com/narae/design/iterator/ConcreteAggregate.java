package com.narae.design.iterator;

/**
 * The ConcreteAggregate has a collection of objects and implements the method that returns an Iterator for its collection.
 * Each ConcreteAggregate is responsible for instantiating a ConcreteIterator that can iterate over its collection of objects.
 */
public class ConcreteAggregate implements Aggregate {
    SomeCollection collection;

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(collection);
    }
}
