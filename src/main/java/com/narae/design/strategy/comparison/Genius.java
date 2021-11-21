package com.narae.design.strategy.comparison;

/**
 * Standard OO techniques.
 */
public abstract class Genius {
    public void greet() {
        System.out.println("Hello :)");
    }

    public void showOff() {
        System.out.println("I am an amazing SW engineer!");
    }

    public abstract void introduce();

    // A localized update to the code caused a non local side effect.
    public void eat() {
        System.out.println("Yum Yum ;O");
    }
}
