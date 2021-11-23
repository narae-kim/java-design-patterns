package com.narae.design.observer.scratch;

/**
 * Statistics monitor keeps track of the min/avg/max measurements.
 */
public class StatisticsMonitor implements Observer, MonitorElement {
    private float downlinkCounter;
    private float uplinkCounter;
    // Hold a reference to the Subject as we may want to un-register this as an observer in the future.
    private Subject telemetryData;

    public StatisticsMonitor(Subject telemetryData) {
        this.telemetryData = telemetryData;
        telemetryData.registerObserver(this);
    }

    /**
     * Monitoring the statistic from the TelemetryData object.
     */
    @Override
    public void monitor() {
        System.out.println("Statistics: \n\tDownlink: " + downlinkCounter + "\n\tUplink: " + uplinkCounter);
    }

    @Override
    public void update(float downlinkCounter, float uplinkCounter) {
        this.downlinkCounter = downlinkCounter;
        this.uplinkCounter = uplinkCounter;
        monitor();
    }
}
