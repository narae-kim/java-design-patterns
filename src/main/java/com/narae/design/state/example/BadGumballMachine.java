package com.narae.design.state.example;

/**
 * Due to the new winner feature, the code is subject to change.
 *
 * This code is not adhering to the Open Closed Principle.
 * We haven't encapsulated anything that varies here.
 */
public class BadGumballMachine {
    // The four states
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    // The instance variable holds the current state
    int state = SOLD_OUT;
    // The instance variable keeps track of the number of gumballs in the machine
    int count = 0;

    public BadGumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * Action as a method.
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You cannot insert another quarter.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot insert a quarter. The machine is sold out.");
        } else if (state == SOLD) {
            System.out.println("Please wait. We are already giving you a gumball.");
        }
    }

    /**
     * Action as a method.
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot eject. You haven't inserted a quarter yet.");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank.");
        }
    }

    /**
     * Action as a method.
     */
    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("You turned ...");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there is no quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned but there are no gumballs.");
        } else if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
        }
    }

    /**
     * Action as a method.
     */
    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed.");
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first.");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed.");
        } else if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot.");
            count -= 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
