# The Decorator Pattern
The Decorator Pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.

* It allows to give objects new responsibilities without making any code changes to the underlying classes.

- Decorators have the same supertype as the objects they decorate.
- One or more decorators can be used to wrap an object.
- Given that the decorator has the same supertype as the object it decorates, we can pass around a decorated object in place of the original (wrapped) object.
- The decorator adds its own behavior either before and/or after delegating to the object it decorates to do the rest of the job.
- Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like.

When we compose a decorator with a component, we are adding new behavior. 
We are acquiring new behavior not by inheriting it from a superclass, but by composing objects together. 
The behavior comes in through the composition of decorators with the base components as well as other decorators because we are using object composition, 
we get a lot more flexibility about how to mix and match decorators and components.

In contrast, if we rely on inheritance, our behavior can only be determined statically at compile time. 
In other words, we get only whatever behavior the superclass gives us or that we override. 
With composition, we can mix and match decorators any way we like at runtime.


Traditionally, the Decorator Pattern does specify an abstract component, but in Java, we could use an interface.

Also, decorators are typically created by using other patterns like Factory and Builder Patterns.
So the creation of the concrete component with its decorator can be “well encapsulated”.


## Design Principle
### The Open-Closed Principle
**Classes should be open for extension but closed for modification.**
- ***Open***: Extend classes with any new behavior you like. If your needs or requirements change, just go ahead and make your own extensions.
- ***Closed***: Won't let you alter the existing code.

Our goal is to allow classes to be easily extended to incorporate new behavior without modifying existing code.

*Pros:*
Designs will be resilient to change and flexible enough to take on new functionality to meet changing requirements.

*Cons:*
Following the Open-Closed Principle usually introduces new levels of abstraction, which adds complexity to our code.

## Diagram
![Decorator](Decorator.svg)

- Each component can be used on its own, or wrapped by a decorator.
- The ConcreteComponent is the object we are going to dynamically add new behavior to.
- Each decorator HAS-A (wraps) a component, which means the decorator has an instance variable that holds a reference to a component.
- Decorators implement the same interface or abstract class as the component they are going to decorate.
- Decorators can extend the state of the component.
- Decorators can add new methods; however, new behavior is typically added by doing computation before or after an existing method in the component.

## Usecase: Java I/O
The large number of I/O classes in the `java.io` package are based on the Decorator Pattern.  


## References
* Head First Design Patterns