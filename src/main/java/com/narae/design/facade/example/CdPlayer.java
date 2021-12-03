package com.narae.design.facade.example;

public class CdPlayer {
    Amplifier amplifier;

    public CdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("CD Player ON");
    }

    public void off() {
        System.out.println("CD Player OFF");
    }

    public void eject() {
        System.out.println("CD is ejected");
    }

    public void pause() {
        System.out.println("CD Player is paused");
    }

    public void play() {
        System.out.println("CD Player PLAY");
    }

    public void stop() {
        System.out.println("CD Player STOP");
    }
}
