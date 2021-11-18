package com.narae.design.strategy;

public class ChildClientB extends Client {
    public ChildClientB() {
        behaviorA = new BehaviorA2();
        behaviorB = new BehaviorB3();
    }

    @Override
    public void doUniqueThing() {
        System.out.println("Hey, I am a Child Client B :)");
    }
}
