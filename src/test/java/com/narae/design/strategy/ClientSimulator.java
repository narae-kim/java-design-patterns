package com.narae.design.strategy;

public class ClientSimulator {
    public static void main(String[] args) {
        Client childA = new ChildClientA();
        Client childB = new ChildClientB();

        System.out.println("--- CHILD A ---");
        childA.performBehaviorA();
        childA.performBehaviorB();
        childA.doCommonThing();
        childA.doUniqueThing();

        System.out.println("--- CHILD B ---");
        childB.performBehaviorA();
        childB.performBehaviorB();
        childB.doCommonThing();
        childB.doUniqueThing();
    }
}
