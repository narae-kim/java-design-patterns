package com.narae.design.strategy.example;

public class PlayAlphaGo implements ShowOffBehavior {
    @Override
    public void showOff() {
        System.out.println("Listen, I play Go better than human being.");
    }
}
