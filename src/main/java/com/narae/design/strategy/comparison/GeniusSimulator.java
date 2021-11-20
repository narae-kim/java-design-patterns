package com.narae.design.strategy.comparison;

public class GeniusSimulator {
    public static void main(String[] args) {
        Genius narae = new Narae();
        //Genius yongdi = new Yongdi();
        //Genius shin = new Shin();
        Genius ai = new AI();
        narae.eat();
        narae.introduce();
        narae.greet();
        narae.showOff();
        ai.greet();
        ai.introduce();
        ai.eat();
        ai.showOff();
    }

}
