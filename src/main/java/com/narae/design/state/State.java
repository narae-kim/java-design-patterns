package com.narae.design.state;

/**
 * Abstract class or interface.
 * The State interface defines a common interface for all concrete states. The states all implement the same interface, so they are interchangeable.
 * The states are used by the Context to represent its internal state and behavior.
 * The client never interacts directly with the states. All requests to the states come from the Context.
 */
public interface State {
    void handle();
}
