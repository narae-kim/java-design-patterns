package com.narae.design.command.example;

public class Stereo {
    String location;
    private int volume;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " stereo is ON");
    }

    public void off(){
        System.out.println(location + " stereo is OFF");
    }

    public void setCd(){
        System.out.println(location + " stereo CD is set to go!");
    }

    public void setRadio(){
        System.out.println(location + " stereo radio is set to go!");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(location + " stereo volume is now set to " + volume);
    }
}
