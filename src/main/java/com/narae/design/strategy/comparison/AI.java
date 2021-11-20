package com.narae.design.strategy.comparison;

// Wait, AI can eat???
public class AI extends Genius {
    @Override
    public void introduce() {
        System.out.println("This is the best Artificial Intelligence ever! I am a genius.");
    }

    public void showOff() {
        System.out.println("I am a cool AI!");
    }

    public void eat() {
    }
}
