package com.narae.design.decorator.example;

public class Cafe {
    public static void main(String[] args) {
        Beverage beverage = new DecafAmericano(BeverageSize.TALL);
        System.out.printf("%s €%.2f",beverage.getDescription(), beverage.cost());

        Beverage beverage1 = new Americano(BeverageSize.GRANDE);
        beverage1 = new Milk(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.printf("\n%s €%.2f",beverage1.getDescription(), beverage1.cost());

        Beverage beverage2 = new ChocoFrappuccino(BeverageSize.VENTI);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf("\n%s €%.2f",beverage2.getDescription(), beverage2.cost());
    }
}
