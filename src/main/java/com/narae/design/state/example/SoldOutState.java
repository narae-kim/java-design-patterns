package com.narae.design.state.example;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert a quarter. The machine is sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cannot eject. You haven't inserted a quarter yet.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there are no gumballs.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}
