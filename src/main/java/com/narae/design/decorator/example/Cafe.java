package com.narae.design.decorator.example;

public class Cafe {
    public static void main(String[] args) {
        Beverage beverage = new DecafAmericano();
        System.out.println(beverage.getDescription() + " €" + beverage.cost());

        Beverage beverage1 = new Americano();
        beverage1 = new Milk(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription() + " €" + beverage1.cost());

        Beverage beverage2 = new ChocoFrappuccino();
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " €" + beverage2.cost());
    }
}
