package com.narae.design.state.example;

public class GumballMachine {
    // The four states - used to transition the machine to a different state.
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    // The instance variable holds the current state.
    State state = soldOutState;
    // The instance variable keeps track of the number of gumballs in the machine.
    int count;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    /**
     * When an action is called, it is delegated to the current state.
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * The dispense() method always called even if the crank is turned without a quarter.
     * This can be fixed by having turnCrank() return a boolean or by introducing exception.
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();  // internal action - a user cannot ask the machine to dispense directly
    }

    /**
     * The method allows other objects to transition the machine to a different state.
     *
     * @param state
     */
    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count -= 1;
        }
    }

    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    // getters for each state
    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
