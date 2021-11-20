package com.narae.design.strategy.example;

public class EatByHuman implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("I can eat of course. Yum Yum ;O");
    }
}
