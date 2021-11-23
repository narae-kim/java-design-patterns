package com.narae.design.observer.scratch;

public class CurrentDataMonitor implements Observer, MonitorElement {
    private float downlinkCounter;
    private float uplinkCounter;
    // Hold a reference to the Subject as we may want to un-register this as an observer in the future.
    private Subject telemetryData;

    public CurrentDataMonitor(Subject telemetryData) {
        this.telemetryData = telemetryData;
        telemetryData.registerObserver(this);
    }

    /**
     * Monitoring the current measurements from the TelemetryData object.
     */
    @Override
    public void monitor() {
        System.out.println("Current state: \n\tDownlink: " + downlinkCounter + "\n\tUplink: " + uplinkCounter);
    }

    @Override
    public void update(float downlinkCounter, float uplinkCounter) {
        this.downlinkCounter = downlinkCounter;
        this.uplinkCounter = uplinkCounter;
        monitor();
    }
}
