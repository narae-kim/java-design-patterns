package com.narae.design.observer.scratch;

/**
 * All our telemetry components implement the Observer interface.
 * This gives the Subject a common interface to talk to when it comes time to update the observers.
 * <p>
 * The Observer interface is implemented by all observers, so they all have to implement the update() method.
 */
public interface Observer {
    /**
     * The arguments are the state values the Observers get from the Subject when a measurement changes.
     *
     * @param downlinkCounter
     * @param uplinkCounter
     */
    void update(float downlinkCounter, float uplinkCounter);
}
