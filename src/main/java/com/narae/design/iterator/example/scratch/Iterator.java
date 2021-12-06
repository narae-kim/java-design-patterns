package com.narae.design.iterator.example.scratch;

public interface Iterator {
    /**
     * @return a boolean indicating whether or not there are more elements to iterate over
     */
    boolean hasNext();

    /**
     * @return the next element
     */
    Object next();
}
