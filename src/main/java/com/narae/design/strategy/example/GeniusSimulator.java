package com.narae.design.strategy.example;

public class GeniusSimulator {
    public static void main(String[] args) {
        Genius narae = new Narae();
        //Genius yongdi = new Yongdi();
        //Genius shin = new Shin();
        Genius ai = new AI();
        narae.performEat();
        narae.introduce();
        narae.greet();
        narae.performShowOff();
        ai.greet();
        ai.introduce();
        ai.performEat();
        ai.performShowOff();
        ai.setShowOffBehavior(new WriteFiction());
        ai.performShowOff();
    }

}
