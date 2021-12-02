package com.narae.design.adapter;

/**
 * All requests get delegated to the Adaptee.
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee specific request");
    }
}
