package com.narae.design.state.example;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert another quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());  // Go to NoQuarterState
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = randomWinner.nextInt(10);  // 10% chance of winning
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());  // Go to SoldState
        }
        // dispense();
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}
