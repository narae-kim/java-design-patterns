package com.narae.design.strategy.example;

public class Shin extends Genius {
    public Shin() {
        eatBehavior = new EatByHuman();
        showOffBehavior = new DevelopApp();
    }

    @Override
    public void introduce() {
        System.out.println("Hi I am Shin. I am a genius :P");
    }
}
