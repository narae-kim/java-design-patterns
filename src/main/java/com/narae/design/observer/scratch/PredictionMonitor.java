package com.narae.design.observer.scratch;

/**
 * The telemetry prediction based on the events.
 */
public class PredictionMonitor implements Observer, MonitorElement {
    private float downlinkCounter;
    private float uplinkCounter;
    // Hold a reference to the Subject as we may want to un-register this as an observer in the future.
    private Subject telemetryData;

    public PredictionMonitor(Subject telemetryData) {
        this.telemetryData = telemetryData;
        telemetryData.registerObserver(this);
    }

    /**
     * Predict the measurements from the TelemetryData object.
     */
    @Override
    public void monitor() {
        System.out.println("Predicted state: \n\tDownlink: " + (downlinkCounter + 1) + "\n\tUplink: " + (uplinkCounter + 1));
    }

    @Override
    public void update(float downlinkCounter, float uplinkCounter) {
        this.downlinkCounter = downlinkCounter;
        this.uplinkCounter = uplinkCounter;
        monitor();
    }
}
