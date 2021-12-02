# The Abstract Factory Pattern
**The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.**

The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.

* Abstract Factory Pattern encapsulates object creation to keep applications loosely coupled and less dependent on implementations.

* Abstract Factory allows a client to use an abstract interface to create a set of related products without knowing about the concrete products that are actually produced. 
  - The client is decoupled from any of the specifics of the concrete products.
  - The job of an Abstract Factory is to define an interface for creating a set of products, or families of products.

* With the Abstract Factory, we derive one or more concrete factories that produce the same product, but with different implementations.
  - A variety of factories can be implemented to produce products meant for different contexts.
  - The client code still stays the same.

* Abstract Factory creates objects by *composition*.

* Downside: **If new products are added, the interface of Abstract Factory has to change.**

* Methods to create products in an Abstract Factory are often implemented with a Factory Method.


## Diagram
![AbstractFactory](AbstractFactoryOverview.svg)


## References
* Head First Design Patterns
