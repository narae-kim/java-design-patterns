package com.narae.design.adapter;

/**
 * The client only sees the Target interface.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adaptedAdaptee = new Adapter(adaptee);

        adaptedAdaptee.request();
    }
}
