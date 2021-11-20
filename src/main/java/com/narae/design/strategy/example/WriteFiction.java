package com.narae.design.strategy.example;

public class WriteFiction implements ShowOffBehavior {
    @Override
    public void showOff() {
        System.out.println("I am a genius writer. I can write a fiction novel.");
    }
}
