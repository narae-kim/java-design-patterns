package com.narae.design.observer.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * THIS EXAMPLE IS NO LONGER VALID SINCE THE Observable AND Observer HAVE BEEN DEPRECATED.
 *
 * This class is now Subject which we can also call the Observable.
 * We don't need the register(), remove() and notifyObservers() methods anymore as they inherit those behaviors from the superclass.
 */
public class TelemetryData extends Observable {
    private float dlEvent;
    private float ulEvent;

    public TelemetryData() {  // no need to create a data structure to hold Observers
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();  // PULL model
    }

    public void setMeasurements(float dlEvent, float ulEvent) {
        this.dlEvent = dlEvent;
        this.ulEvent = ulEvent;
        measurementChanged();
    }

    /**
     *
     * @return the most recent downlink event
     */
    public float getDonwnlinkEvent() {
        return dlEvent;
    }

    /**
     *
     * @return the most recent uplink event
     */
    public float getUplinkEvent() {
        return ulEvent;
    }
}
