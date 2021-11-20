package com.narae.design.strategy.example;

public class Narae extends Genius {
    public Narae() {
        eatBehavior = new EatByHuman();
        showOffBehavior = new WriteFiction();
    }

    @Override
    public void introduce() {
        System.out.println("Hi I am Narae. I am a genius :p");
    }
}
