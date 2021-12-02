# The Factory Method Pattern
**The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.**

The intent of Factory Method is to allow a class to defer instantiation to its subclasses.

* Instantiation is an activity that should not always be done in public and can often lead to coupling problems.
  - Instantiating a concrete class can make the code more fragile and less flexible.
  - Factory Patterns can remove the dependencies.

* All factory patterns encapsulate object creation.
The factory patterns avoid duplication in the code and provide only one place to perform maintenance. 
  - The clients only depend on interfaces rather than the concrete classes required to instantiate objects.
  (*program to an interface, not an implementation* - make the code more flexible and extensible)

* The Factory Method Pattern encapsulates object creation by letting subclasses decide what objects to create.

* The Factory Method Pattern provides a framework by supplying a common method that can be combined with a factory method. 
  - It encapsulates product knowledge into each creator.

* Factory Method creates objects through **inheritance**.

## Design Principles
* **Dependency Inversion Principle**
  - Depend upon abstractions. Do not depend upon concrete classes.
    - It suggests that our high-level components should not depend on our low-level components; rather, they should both depend on abstractions.
    - A "high-level" component is a class with behavior defined in terms of "low-level" components.
    - For example, "high-level component" is PizzaStore and "low-level components" are the pizza implementations.
    - With the Factory Method, the high-level component, the PizzaStore, and the low-level components, the pizzas, both depend on Pizza, the abstraction.

### Guidelines to Dependency Inversion Principle
* No variable should hold a reference to a concrete class.
  - Instead of the 'new' operator, use a factory.
* No class should derive from a concrete class.
  - Derive from an abtraction like an interface or an abstract class.
* No method should override an implemented method of any of its base classes.
  - If you override an implemented method, then your base class would not be an abstraction to start with.
  Those methods implemented in the base class are meant to be shared by all the subclasses.

However, if you have a class that is not likely to change, then it is acceptable if you instantiate a concrete class.

## Comparison
Here, several concrete classes are instantiated, and the decision of which to instantiate is made at runtime depending on some set of conditions.

When you have a whole set of related concrete classes, often you are forced to write code like this:
```java
class Test {
    Duck duck;
    public static void main(String[] args){
      // We don't know until runtime which one we need to instantiate.
      if (picnic) {
          duck = new MallardDuck();
      } else if (hunting) {
                 duck = new DecoyDuck();
      } else if (inBathTub) {
          duck = new RubberDuck();
      }
    }
}
```

In this kind of code, when it comes time for changes or extensions, we have to reopen the code and examine what needs to be added or deleted. 
Also, the code can end up in several parts of the application making maintenance and updates more difficult and error-prone.

In other words, the code will not be *closed for modification*.

## Diagram
![FactoryMethod](FactoryMethod.svg)

* Factory Method: Encapsulating object creation.
  - Place the code in an object that is only going to worry about how to create concrete products.


## References
* Head First Design Patterns