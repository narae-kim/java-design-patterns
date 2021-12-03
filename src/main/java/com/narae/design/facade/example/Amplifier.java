package com.narae.design.facade.example;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier ON");
    }

    public void off() {
        System.out.println("Amplifier OFF");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println("Amplifier SET a CD Player");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Amplifier SET a DVD Player");
    }

    public void setStereoSound() {
        System.out.println("Amplifier SET Stereo Sound");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier SET Surround Sound");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Amplifier SET a Tuner");
    }

    public void setVolume(int volume) {
        System.out.println(String.format("Amplifier SET the volume to %s", volume));
    }
}
