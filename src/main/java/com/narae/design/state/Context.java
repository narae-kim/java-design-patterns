package com.narae.design.state;

/**
 * The Context is the class that can have a number of internal states.
 * When the state transitions are fixed, they are appropriate for putting in the Context.
 * When the transitions are more dynamic, they are typically placed in the state classes themselves. (Ex. the transition to NoQuarter or SoldOut depended on the runtime count of gumballs)
 */
public class Context {
    // Assign each state to a "static" instance variable to share the state objects across the instances of the Context.
    State concreteStateA;
    State concreteStateB;
    State state;

    public Context() {
        concreteStateA = new ConcreteStateA(this);
        concreteStateB = new ConcreteStateB(this);
    }

    /**
     * It is delegated to the state to handle.
     */
    public void request() {
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getConcreteStateA() {
        return concreteStateA;
    }

    public State getConcreteStateB() {
        return concreteStateB;
    }
}
