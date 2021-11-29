package com.narae.design.command.myexample;

public class NetworkService {
    private String virturalFuction;

    public NetworkService(String virturalFuction) {
        this.virturalFuction = virturalFuction;
    }

    public void onboard() {
        System.out.println(virturalFuction + " service is onboarded.");
    }

    public void distribute() {
        System.out.println(virturalFuction + " service is distributed.");
    }

    public void instantiate() {
        System.out.println(virturalFuction + " service is instantiated.");
    }

    public void delete() {
        System.out.println(virturalFuction + " service is deleted.");
    }
}
