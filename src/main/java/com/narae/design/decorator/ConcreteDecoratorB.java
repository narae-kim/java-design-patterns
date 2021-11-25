package com.narae.design.decorator;

public class ConcreteDecoratorB extends Decorator {
    Component wrappedObj;

    public ConcreteDecoratorB(Component wrappedObj) {
        this.wrappedObj = wrappedObj;
    }

    @Override
    public void methodA() {
        super.methodA();
        //
    }

    @Override
    public void methodB() {
        //
    }

    // other methods
}
