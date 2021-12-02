# The Abstract Factory Pattern
The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 
Abstract Factory allows a client to use an abstract interface to create a set of related products without knowing about the concrete products that are actually produced. 
In this way, the client is decoupled from any of the specifics of the concrete products.


## Example: Building the ingredient factories
## Scenario
The head of the pizza stores decides to control the ingredients of the pizzas for their franchises depending on their region.

## Approaches 
* An Abstract Factory provides an interface for a family of products such as dough, sauce, cheese and veggies.
  - The code is decoupled by the actual factory that creates the products.
  - That allows to implement a variety of factories that produce products meant for different contexts.
 
* With the abstract factory, we derive one or more concrete factories that produce the same products, but with different implementations.
  - The client code still stays the same.


## References
* Head First Design Patterns
