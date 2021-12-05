package com.narae.design.templatemethod;

abstract class AbstractClass {
    /**
     * The template method makes use of the primitiveOperations to implement an algorithm.
     * It is decoupled from the actual implementation of these operations.
     * It is declared "final" to prevent subclasses from reworking the sequence of the steps in the algorithm.
     */
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    /**
     * Abstract version of the operation used in the template method must be implemented by concrete subclasses.
     */
    abstract void primitiveOperation1();

    /**
     * Abstract version of the operation used in the template method must be implemented by concrete subclasses.
     */
    abstract void primitiveOperation2();

    /**
     * This method is declared "final" so that subclasses cannot override it.
     * It may be used in the template method directly, or used by subclasses.
     */
    final void concreteOperation() {
        System.out.println("Abstract class concrete operation");
    }

    /**
     * The abstract class provides an empty or a default implementation in a hook method.
     * Subclasses are free to override the hook method but they do not have to.
     */
    void hook() {
    }
}
