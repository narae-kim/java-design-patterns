package com.narae.design.command;

/**
 * The Receiver knows how to perform the work needed to carry out the request. Any class can act as a Receiver.
 */
public class Receiver {
    public void action() { System.out.println("Receiver action called."); }
}
