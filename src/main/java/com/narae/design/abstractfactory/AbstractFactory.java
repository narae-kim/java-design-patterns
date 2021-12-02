package com.narae.design.abstractfactory;

/**
 * The AbstractFactory defines the interface that all concrete factories must implement, which consists of a set of methods for producing products.
 */
public interface AbstractFactory {
    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
