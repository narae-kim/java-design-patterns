package com.narae.design.strategy.example;

/**
 * The Genius class now "delegates" its eating and showing off behavior, instead of using eat() and showOff() methods inside the class.
 */
public abstract class Genius {
    // add instance variables that represent the behaviors as the interface type
    // set the variables polymorphically to reference the specific behavior type at runtime
    // the instance variables hold a reference to a specific behavior at runtime > "QUIZ"
    EatBehavior eatBehavior;
    ShowOffBehavior showOffBehavior;

    public void greet() {
        System.out.println("Hello :)");
    }

    public abstract void introduce();

    /**
     * Delegating behavior to the object referenced by eatBehavior
     */
    public void performEat() {
        eatBehavior.eat();  // dynamic binding
    }

    public void performShowOff() {
        showOffBehavior.showOff();
    }

    public void setEatBehavior(EatBehavior eb){
        eatBehavior = eb;
    }

    public void setShowOffBehavior(ShowOffBehavior sb){
        showOffBehavior = sb;
    }
}
