package com.narae.design.facade.example;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // Normally the client is given a facade, it does not have to construct one itself.
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner(amp);
        DvdPlayer dvdPlayer = new DvdPlayer(amp);
        CdPlayer cdPlayer = new CdPlayer(amp);
        Projector projector = new Projector(dvdPlayer);
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        // Instantiate the Facade with all the components in the subsystem.
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popper);

        homeTheater.watchMovie("About Time");
        homeTheater.endMovie();
    }
}
