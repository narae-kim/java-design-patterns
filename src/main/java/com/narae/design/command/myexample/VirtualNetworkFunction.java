package com.narae.design.command.myexample;

public class VirtualNetworkFunction {
    public static final int TRAFFIC_HIGH = 2;
    public static final int TRAFFIC_LOW = 1;
    public static final int NOT_EXIST = 0;
    private String virturalFuction;
    private int numberOfInstances;

    public VirtualNetworkFunction(String virturalFuction) {
        this.virturalFuction = virturalFuction;
        numberOfInstances = NOT_EXIST;
    }

    public void setTrafficHigh() {
        numberOfInstances = TRAFFIC_HIGH;
        System.out.println("The number of instances of " + virturalFuction + " VNF is now set to " + TRAFFIC_HIGH);
    }

    public void setTrafficLow() {
        numberOfInstances = TRAFFIC_LOW;
        System.out.println("The number of instances of " + virturalFuction + " VNF is now set to " + TRAFFIC_LOW);
    }

    public void setNotExist() {
        numberOfInstances = NOT_EXIST;
        System.out.println("The number of instances of " + virturalFuction + " VNF is now set to " + NOT_EXIST + ".");
    }

    public int getNumberOfInstances() {
        return numberOfInstances;
    }

    public void instantiate() {
        if (numberOfInstances != NOT_EXIST) {
            System.out.println(numberOfInstances + " number of " + virturalFuction + " VNF is instantiated.");
        } else {
            delete();
        }

    }

    public void delete() {
        System.out.println(virturalFuction + " VNF is deleted.");
    }
}
