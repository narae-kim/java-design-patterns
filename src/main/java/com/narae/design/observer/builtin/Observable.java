package com.narae.design.observer.builtin;

/**
 * High-level overview of Observable class.
 * The Observable class keeps track of all the observers and notifies them for you.
 */
class Observable {
    private boolean changed;

    /**
     * This class just shows the high-level view of java.util.Observable class, so it should NOT be instantiable.
     */
    private Observable() {
    }

    public void addObserver() {
    }

    public void deleteObserver() {
    }

    /**
     * If this method is called without first calling setChanged(), the observers will NOT be notified.
     */
    public void notifyObservers(Object arg) {
        if (changed) {
            // for every observer on the list { call update(this, arg) }
            changed = false;
        }

    }

    /**
     * This method is used to signify that the state has changed.
     * When notityObservers() is called, it should update its observers.
     */
    void setChanges() {
        changed = true;
    }
}
