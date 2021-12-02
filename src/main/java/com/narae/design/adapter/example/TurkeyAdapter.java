package com.narae.design.adapter.example;

/**
 * The Adapter implements the target interface and holds an instance of the Adaptee.
 * Implement the interface of the type it is adapting to, which is the interface the client expects to see.
 * The one class cleanly encapsulates all the changes.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    /**
     * Get a reference to the object that is adapting.
     *
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * Implement the methods in the interface to translate between the classes.
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * Implement the methods in the interface to translate between the classes.
     */
    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }
}
