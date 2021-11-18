package com.narae.design.strategy;

public class ChildClientA extends Client {

    public ChildClientA() {
        behaviorA = new BehaviorA1();
        behaviorB = new BehaviorB2();
    }

    public void doUniqueThing() {
        System.out.println("Hey, I am a Child Client A :)");
    }
}
