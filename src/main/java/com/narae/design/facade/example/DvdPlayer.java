package com.narae.design.facade.example;

public class DvdPlayer {
    Amplifier amplifier;
    String movie;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("DVD Player ON");
    }

    public void off() {
        System.out.println("DVD Player OFF");
    }

    public void eject() {
        System.out.println("DVD is ejected");
    }

    public void pause() {
        System.out.println("DVD Player is paused");
    }

    public void play() {
        System.out.println("DVD Player PLAY");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(String.format("DVD Player PLAY \"%s\"", movie));
    }

    public void stop() {
        System.out.println(String.format("DVD Player STOP \"%s\"", movie));
    }
}
