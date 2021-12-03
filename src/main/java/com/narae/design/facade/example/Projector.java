package com.narae.design.facade.example;

public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Projector ON");
    }

    public void off() {
        System.out.println("Projector OFF");
    }

    public void tvMode() {
        System.out.println("Project SET to TV Mode");
    }

    public void wideScreenMode() {
        System.out.println("Project SET to Wide Screen Mode");
    }
}
