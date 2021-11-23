package com.narae.design.observer.scratch;

import java.util.ArrayList;

/**
 * The TelemetryData object tracks the data from the source of the counters and updates the monitors.
 */
public class TelemetryData implements Subject {
    private ArrayList observers;
    private float dlEvent;
    private float ulEvent;

    public TelemetryData() {
        observers = new ArrayList();
    }

    /**
     * When an observer registers, it is added to the end of the list.
     *
     * @param observer to be registered.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * When an observer un-registers, it is removed from the list.
     *
     * @param observer to be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * Update all the observers about the state whom all implement update().
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(dlEvent, ulEvent);
        }
    }

    /**
     * This method gets called whenever the counters have been updated to notify the observers.
     */
    public void measurementsChanged() {
        notifyObservers();
        /* NOT GOOD TO HAVE A CONCRETE IMPLEMENTATION
        // the most recent measurements
        float dlEvent = getDonwnlinkEvent();
        float ulEvent = getUplinkEvent();

        // By coding to concrete implementations, the monitors, we have no way to add or remove other display elements without making changes to the program.
        // Need to encapsulate these.
        currentDataMonitor.update(dlEvent, ulEvent);
        statisticsMonitor.update(dlEvent, ulEvent);
        predictionMonitor.update(dlEvent, ulEvent);
         */
    }

    /**
     * For a simple implementation to measurements instead of reading actual counter data for now.
     *
     * @param dlEvent
     * @param ulEvent
     */
    public void setMeasurements(float dlEvent, float ulEvent) {
        this.dlEvent = dlEvent;
        this.ulEvent = ulEvent;
        measurementsChanged();
    }

    /**
     * Assume the TelemetryData object knows how to get updated info from the source.
     *
     * @return the most recent downlink event
     */
    public float getDonwnlinkEvent() {
        return (float) ((int) ((Math.random() * 10000)) / 100.0);
    }

    /**
     * Assume the TelemetryData object knows how to get updated info from the source.
     *
     * @return the most recent uplink event
     */
    public float getUplinkEvent() {
        return (float) ((int) ((Math.random() * 10000)) / 100.0);
    }
}
