package com.narae.design.facade.example;

public class TheaterLights {
    public void on() {
        System.out.println("Theater Lights ON");
    }

    public void off() {
        System.out.println("Theater Lights OFF");
    }

    public void dim(int percentage) {
        System.out.println(String.format("Theater Lights dimed %d%%", percentage));
    }
}
