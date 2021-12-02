package com.narae.design.factorymethod.example;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza naraePizza = nyStore.orderPizza("cheese");
        System.out.println("Narae ordered a " + naraePizza.getName() + "\n");

        Pizza tomPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Tom ordered a " + tomPizza.getName());
    }
}
