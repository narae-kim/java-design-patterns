# The Adapter Pattern
**The Adapter Pattern converts the interface of a class into another interface the clients expect. 
Adapter lets classes work together that could not otherwise because of incompatible interfaces.**

* The Adapter Pattern allows one interface to adapt a different interface for a class that implements it. 

* The Adapter Pattern decouples the client from the implemented interface, and if we expect the interface to change over time, 
the adapter encapsulates that change so that the client does not have to be modified each time it needs to operate against a different interface.

> If it walks like a duck and quacks like a duck, then it might be a turkey wrapped with a duck adapter!

* There are two kinds of adapters: *object adapters* and *class adapters*.

Note that the Facade Pattern will handle an adapter that holds two or more adaptees to implement the target interface.


## How the client uses the Adapter
1. The client makes a request to the adapter by calling a method on it using the target interface.
2. The adapter translates the request into one or more calls on the adaptee using the adaptee interface.
3. The client receives the results of the call and never knows there is an adapter doing the translation.

Note that the Client and Adaptee are decoupled - neither knows about the other.


## The object adapter
![ObjectAdapter](ObjectAdapter.svg)

In object adapter, the Adapter uses composition to pass requests to the Adaptee.
This approach has the added advantage that we can use an Adapter with any subclass of the Adaptee.


## The class adapter
![ClassAdapter](ClassAdapter.svg)

A class adapter requires multiple inheritance to implement it, which is not allowed in Java.
In other words, the Adapter subclasses the Target and the Adaptee classes.


## References
* Head First Design Patterns