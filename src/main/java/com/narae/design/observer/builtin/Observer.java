package com.narae.design.observer.builtin;

import java.util.Observable;

/**
 * High-level overview of Observer interface.
 * This interface just shows the high-level view of java.util.Observer interface, so it should NOT be implemented.
 *
 * All our telemetry components implement the Observer interface.
 * This gives the Subject a common interface to talk to when it comes time to update the observers.
 *
 * The Observer interface is implemented by all observers, so they all have to implement the update() method.
 */
interface Observer {
    /**
     *
     * @param observable
     * @param arg
     */
    void update(Observable observable, Object arg);
}
