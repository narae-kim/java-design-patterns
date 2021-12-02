package com.narae.design.adapter.example;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        // Makes the turkey look like a Duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    /**
     * The testDuck() method expects a Duck object.
     *
     * @param duck
     */
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
