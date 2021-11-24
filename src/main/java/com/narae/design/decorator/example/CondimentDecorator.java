package com.narae.design.decorator.example;

/**
 * Abstract Decorator class.
 * It implements the desired interface to be interchangeable with, i.e. the Beverage class.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
