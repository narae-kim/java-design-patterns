package com.narae.design.observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class CurrentDataMonitor implements Observer, MonitorElement {
    Observable observable;
    private float downlinkCounter;
    private float uplinkCounter;

    public CurrentDataMonitor(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof TelemetryData) {
            TelemetryData telemetryData = (TelemetryData) observable;
            this.downlinkCounter = telemetryData.getDonwnlinkEvent();
            this.uplinkCounter = telemetryData.getUplinkEvent();
            monitor();
        }
    }

    /**
     * Monitoring the current measurements from the TelemetryData object.
     */
    @Override
    public void monitor() {
        System.out.println("Current state: \n\tDownlink: " + downlinkCounter + "\n\tUplink: " + uplinkCounter);
    }
}
