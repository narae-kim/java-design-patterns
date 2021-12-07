# The State Pattern
**The State Pattern allows an object to alter its behavior when its internal state changes. 
The object will appear to change its class.**

* The State Pattern encapsulates state into separate classes and delegates to the object representing the current state where behavior changes along with the internal state.
  - By encapsulating each state into a class, we localize any changes that will need to be made.

* From the perspective of a client, if an object can completely change its behavior, then it appears that the object is instantiated from another class. 
In reality, however, we are using composition to give the appearance of a class change by simply referencing different state objects.


## The Strategy Pattern vs. The State Pattern
The Strategy and State Patterns were twins separated at birth.
The Strategy Pattern creates interchangeable algorithms, while the State Pattern helps objects to control their behavior by changing their internal state.

* In **the Strategy Pattern**, the **client** usually specifies the strategy object that the context is composed with.
  - While it provides the flexibility to change the strategy object at runtime, often there is a strategy object that is most appropriate for a context object.
*  In **the State Pattern**, the client usually knows very little about the state objects. 
A set of behaviors are encapsulated in state objects, and at any time the **context** is delegating to one of those states.

* The intend of the Strategy Pattern is to change the behavior by composing with a different object as a flexible alternative to subclassing.
* The intend of the State Pattern is to change the state object in context to change its behavior by encapsulating the behaviors within state objects as an alternative to putting lots of conditionals in the context.


## Diagram
![State](State.svg)


## References
* Head First Design Patterns
