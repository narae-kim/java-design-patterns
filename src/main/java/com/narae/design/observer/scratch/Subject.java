package com.narae.design.observer.scratch;

public interface Subject {
    /**
     * The method takes an Observer as an argument.
     *
     * @param observer to be registered or removed.
     */
    void registerObserver(Observer observer);

    /**
     * The method takes an Observer as an argument.
     *
     * @param observer to be registered or removed.
     */
    void removeObserver(Observer observer);

    /**
     * The method is called to notify all observers when the Subject's state has changed.
     */
    void notifyObservers();
}
