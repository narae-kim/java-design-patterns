package com.narae.design.iterator;

/**
 * Having a common interface for the aggregates for the client. It decouples the client from the implementation of the collection of objects.
 * Iterator interface from scratch or java.util.Iterator.
 */
public interface Aggregate {
    Iterator createIterator();
}
