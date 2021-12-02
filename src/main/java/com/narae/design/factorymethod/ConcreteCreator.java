package com.narae.design.factorymethod;

/**
 * The ConcreteCreator implements the factoryMethod(), which is the method that actually produces products.
 * The ConcreteCreator is responsible for creating one or more concrete products.
 * It is the only class that has the knowledge of how to create these products.
 */
public class ConcreteCreator extends Creator {
    /**
     * The parameterized factory method.
     * Often a factory just produces one object and is not parameterized.
     *
     * @param type (A factory method may be parameterized to select among several variations of a product.)
     * @return
     */
    @Override
    Product factoryMethod(String type) {
        // for example, if type matching
        return new ConcreteProduct();
    }
}
