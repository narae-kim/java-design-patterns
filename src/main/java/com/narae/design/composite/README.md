# The Composite Pattern
**The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. 
Composite lets clients treat individual objects and compositions of objects uniformly.**

* The Composite Pattern allows us to build structures of objects in the form of trees that contain both compositions of objects and individual objects as nodes.

* A **composite** holds a set of children, those children may be other composites or **leaf** elements.
  - Elements with child elements are called *nodes*.
  - Elements without children are called *leaves*.
  - When you organize data in this way you end up with a tree structure with a composite at the root and branches of composites growing up to leaf nodes.

* The Composite Pattern gives us a way to create a tree structure that can handle a nested group of composites and leaves in the same structure.
  - Some simple code that can apply the same operation over both composites and individual objects.
  - In other words, in most cases we can ignore the differences between compositions of objects and individual objects.
  - The client does not have to write `if` statements everywhere to make sure they are calling the right methods on the right objects.
   Often, they can make one method call and execute an operation over an entire structure.

## Considerations
* The approach with separate interfaces for different objects to prevent to make nonsensical method calls is a much safer version of the Composite Pattern, 
but it requires the client to check the type of every object before making a call so the object can be cast correctly.

* If a composite needs to keep its children in a particular order, you will need a more sophisticated management scheme for adding and removing children,
and you will have to be careful about how you traverse the hierarchy.

* Caching. If the composite structure is complex or expensive to traverse, it is helpful to implement caching of the composite nodes.
For instance, if you are constantly traversing a composite and all its children to compute some result, you could implement a cache that stores the result temporarily to save traversals.


## Design Principle
The Composite Pattern manages a hierarchy AND it performs operations, which are two responsibilities.
It means that the Composite pattern is against the Single Responsibility design principle.

There are many design tradeoffs in implementing the Composite Pattern - transparency and safety.
- Composite Pattern takes the Single Responsibility design principle and trades it for ***transparency***.
  - Transparency? By allowing the Component interface to contain the child management operations AND the leaf operations, 
  a client can treat both composites and leaf nodes uniformly; so whether an element is a composite or leaf node becomes transparent to the client.

- Now given we have both types of operations in the Component class, we lose a bit of ***safety*** because a client might try to do something inappropriate or meaningless on an element.


We could take the design in the other direction and separate out the responsibilities into interfaces.
This would make our design safe, in the sense that any inappropriate calls on elements would be caught at compile time or runtime, 
but we will lose transparency and our code would have to use conditionals and the `instanceof` operator.


## Diagram
![Composite](Composite.svg)


## References
* Head First Design Patterns
