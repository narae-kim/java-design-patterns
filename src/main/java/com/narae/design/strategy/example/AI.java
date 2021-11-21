package com.narae.design.strategy.example;

public class AI extends Genius {
    public AI() {
        eatBehavior = new EatNotPossible();
        showOffBehavior = new PlayAlphaGo();
    }

    @Override
    public void introduce() {
        System.out.println("This is the best Artificial Intelligence ever! I am a genius.");
    }
}
