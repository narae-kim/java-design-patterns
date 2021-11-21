# Strategy Pattern
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

## Design Principles
### Encapsulate what varies
Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't. 

### Program to an interface, not an implementation
> Interface: The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code. 
> “program to a supertype” as “the declared type of the variables should be a supertype, usually an abstract class or interface, 
> so that the objects assigned to those variables can be of any concrete implementation of the supertype, 
> which means the class declaring them doesn’t have to know about the actual object types!

Make sure that we can change the behavior **dynamically**.
In other words, we should include behavior setter methods in the superclass so that we can change a behavior at runtime.

### Favor composition over inheritance
When you put two classes together you’re using composition. 
Instead of inheriting their behavior, the classes get their behavior by being composed with the right behavior object.

* Creating systems using composition gives you a lot more flexibility.
  * Not only does it let you encapsulate a family of algorithms into their own set of classes, 
  but it also lets you change behavior at runtime as long as the object you’re composing with implements the correct behavior interface.

## How to build the pattern?
1) Add instance variables to delegate behaviors instead of  a specific method in the superclass. 

2) Compile the behavior interface and the concrete behavior implementation classes.

3) Implement a new method called, e.g. performEat() and/or performShowOff().

4) Set the behaviors in the subclasses of the domain object, e.g. Narae, Yongdi and Shin.
Then, when performXXX() is called, the responsibility for the behavior is delegated to the object and we get a real behavior.

5) Setter for the behaviors in the superclass for setting behavior dynamically.
**If the implementation of the behavior lives inside the superclass, then you can't change their behavior dynamically at runtime.** 


## Examples
First read README.md from the package `com.narae.design.strategy.comparison`.
Then, read README.md from the package `com.narae.design.strategy.example`.


*Reference*: Head First Design Patterns