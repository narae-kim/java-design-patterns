package com.narae.design.command.example;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " Ceiling Fan speed HIGH");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " Ceiling Fan speed MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " Ceiling Fan speed LOW");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " Ceiling Fan speed OFF");
    }

    /**
     * Get the current speed of the ceiling fan.
     *
     * @return
     */
    public int getSpeed() {
        return speed;
    }
}
