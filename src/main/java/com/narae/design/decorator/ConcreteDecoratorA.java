package com.narae.design.decorator;

public class ConcreteDecoratorA extends Decorator {
    Component wrappedObj;

    public ConcreteDecoratorA(Component wrappedObj) {
        this.wrappedObj = wrappedObj;
    }

    @Override
    public void methodB() {
        newBehavior();
    }

    void newBehavior() {
    }

    // other methods
}
