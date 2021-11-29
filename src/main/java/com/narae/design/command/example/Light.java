package com.narae.design.command.example;

/**
 * The Vendor Classes are used to perform the actual home-automation work of controlling devices.
 */
public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " light is ON");
    }

    public void off(){
        System.out.println(location + " light is OFF");
    }
}
