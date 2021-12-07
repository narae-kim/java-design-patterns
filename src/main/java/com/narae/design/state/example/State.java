package com.narae.design.state.example;

/**
 * State interface contains a method for every action in the Gumball Machine.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
