package com.narae.design.templatemethod;

/**
 * Each concrete classes implement the full set of operations required by the template method.
 */
class ConcreteClass extends AbstractClass {
    @Override
    void primitiveOperation1() {
        System.out.println("Concrete class primitive operation 1");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("Concrete class primitive operation 2");
    }
}
