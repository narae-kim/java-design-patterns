package com.narae.design.facade.example;

/**
 * HomeTheaterFacade exposes a few simple methods for a complex subsystem.
 */
public class HomeTheaterFacade {
    // Composition so that the facade has access to all the components of the subsystem.
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popper = popper;
    }

    /**
     * Bring the components of the subsystem together into a unified interface.
     * For each task we are delegating the responsibility to the corresponding component in the subsystem.
     *
     * @param movie
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie ...");
        popper.on();
        popper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    /**
     * Each task is delegated to the appropriate component in the subsystem.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down ...");
        popper.off();
        theaterLights.off();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
