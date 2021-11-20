package com.narae.design.strategy.example;

public class Yongdi extends Genius {
    public Yongdi() {
        eatBehavior = new EatByHuman();
        showOffBehavior = new DevelopApp();
    }

    @Override
    public void introduce() {
        System.out.println("Hi I am Yongdi. I am a genius :)");
    }
}
