package com.narae.design.state;

/**
 * ConcreteStates handle requests from the Context.
 * Each ConcreteState provides its own implementation for a request. In this way, when the Context changes state, its behavior will change as well.
 */
public class ConcreteStateA implements State {
    Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    /**
     * TODO - Override the method properly.
     */
    @Override
    public void handle() {

    }
}
