package com.narae.design.abstractfactory;

/**
 * The Client is written against the abstract factory and then composed at runtime with an actual factory.
 */
public class Client {
    AbstractFactory factory;
    AbstractProductA productA;
    AbstractProductB productB;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void createProduct() {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }
}
