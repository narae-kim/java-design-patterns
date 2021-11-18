package com.narae.design.strategy;

public abstract class Client {
    // declare the reference variables for the behavior interface types. All client subclasses inherit these.
    EncapsulatedBehaviorA behaviorA;
    EncapsulatedBehaviorB behaviorB;

    public void doCommonThing(){
        System.out.println("Do a common thing.");
    }

    public abstract void doUniqueThing();

    public void performBehaviorA() {
        behaviorA.doBehaviorA();  // delegate to the behavior class
    }

    public void performBehaviorB() {
        behaviorB.doBehaviorB();  // delegate to the behavior class
    }

    public void setBehaviorA(EncapsulatedBehaviorA behaviorA) {
        this.behaviorA = behaviorA;
    }

    public void setBehaviorB(EncapsulatedBehaviorB behaviorB) {
        this.behaviorB = behaviorB;
    }
}
