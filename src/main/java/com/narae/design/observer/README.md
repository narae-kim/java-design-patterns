# The Observer Pattern
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

> Publishers + Subscribers = Observer Pattern

We call the publisher the *subject* and the subscribers the *observers*.

Since the subject is the sole owner of the data, the observers are dependent on the subject to update them when the data changes.
This leads to a cleaner OO design than allowing many objects to control the same data.

**The Observer Pattern provides an object design where subjects and observers are loosely coupled.** 
Therefore, they can interact but they have very little knowledge of each other. 
Because the two are loosely coupled, we are free to make changes to either the subject or an observer as they will not affect each other.
Also, we can reuse subjects or observers independently of each other.


 * Subject object manages data (holds state).
 * New observers can be added at any time.
 * The observers have subscribed to (registered with) the Subject to receive updates when the Subject's data changes.
 * When data in the Subject changes, the observers are automatically notified.
 * New data values are communicated to the observers in some form when they change.
 * The observers also can unsubscribe the Subject at any time.

## Design Principle
* Strive for loosely coupled designs between objects that interact.
Loosely coupled designs allow us to build flexible OO systems that can handle change 
because they minimize the interdependency between objects.


## The Observer Pattern 1
![ObserverPattern1](OberserPattern1.svg)

* Objects use the Subject interface to register as observers and also to remove themselves from being observers.
* Each subject can have many observers.
* All potential observers need to implement the Observer interface. 
The only one method, `update()` that gets called when the Subject's state changes.
  - Even though every component has a different type, they should all implement the same interface so that the Subject object will know how to send them the measurements.
* Concrete subject always implements the Subject interface. 
The `notifyObservers()` method is used to update all the current observers whenever state changes.
* The concrete subject may also have methods for setting and getting its state.
* Concrete observers can be any class that implements the Observer interface.
Each observer registers with a concrete subject to receive updates.


***Examples are in the `com.narae.design.observer.scratch` package.***


***Reference***: Head First Design Patterns