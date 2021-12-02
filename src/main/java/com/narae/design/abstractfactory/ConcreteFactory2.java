package com.narae.design.abstractfactory;

/**
 * The concrete factories implement the different product families.
 * To create a product, the client uses one of these factories instead of instantiating a product object.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
