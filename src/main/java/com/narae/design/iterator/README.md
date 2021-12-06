# The Iterator Pattern
**The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.**

* An Iterator takes the job of iterating over an aggregate and encapsulates it in another object.

* An Iterator provides a common interface for traversing the items of an aggregate, allowing you to use polymorphism when writing code that makes use of the items of the aggregate.
  - The client can use the same code to iterate over any group of objects since the implementation details are not exposed.

* The Iterator pattern places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate interface and implementation, and places the responsibility where it should be.


## Design Principle
### Single Responsibility
**A class should have only one reason to change.**

The principle guides us to assign each responsibility to one class, and only one class.
Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change.


***Bad Example***:
- Make aggregates to implement their internal collections and related operations AND the iteration methods.

**To Do**:
- The only way to succeed is to be diligent in examining your designs and to watch out for signals that a class is changing in more than one way as your system grows.

> **Cohesion** is a term used as a measure of how closely a class or a module supports a single purpose or responsibility.
>
> Ex. A module or class has high cohesion when it is designed around a set of related functions.
>     It has low cohesion when it is designed around a set of unrelated functions.

Classes that adhere to the principle tend to have high cohesion and are more maintainable than classes that take on multiple responsibilities and have low cohesion.


## Diagram
![Iterator](Iterator.svg)


## References
* Head First Design Patterns
