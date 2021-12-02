package com.narae.design.abstractfactory;

/**
 * The concrete factories implement the different product families.
 * To create a product, the client uses one of these factories instead of instantiating a product object.
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
