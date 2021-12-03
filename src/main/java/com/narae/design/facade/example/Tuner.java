package com.narae.design.facade.example;

public class Tuner {
    Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Tuner ON");
    }

    public void off() {
        System.out.println("Tuner OFF");
    }
}
