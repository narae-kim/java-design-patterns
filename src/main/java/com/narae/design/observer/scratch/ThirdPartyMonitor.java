package com.narae.design.observer.scratch;

public class ThirdPartyMonitor implements Observer, MonitorElement {
    private float downlinkCounter;
    private float uplinkCounter;
    // Hold a reference to the Subject as we may want to un-register this as an observer in the future.
    private Subject telemetryData;

    public ThirdPartyMonitor(Subject telemetryData) {
        this.telemetryData = telemetryData;
        telemetryData.registerObserver(this);
    }

    /**
     * New monitoring from the TelemetryData object.
     */
    @Override
    public void monitor() {
        //
    }

    @Override
    public void update(float downlinkCounter, float uplinkCounter) {
        this.downlinkCounter = downlinkCounter;
        this.uplinkCounter = uplinkCounter;
        monitor();
    }
}
