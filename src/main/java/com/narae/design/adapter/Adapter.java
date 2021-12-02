package com.narae.design.adapter;

/**
 * The Adapter implements the Target interface.
 * Adapter is composed with the Adaptee.
 */
public class Adapter implements Target {
    /**
     * The use of object composition to wrap the adaptee with an altered interface adds advantage that we can use an adapter with any subclass of the adaptee.
     */
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
