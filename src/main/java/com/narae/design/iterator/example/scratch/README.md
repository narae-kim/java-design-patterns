# The Iterator Pattern
**The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.**


## Example scenarios
The Pancake House now needs to merge their menu with the Diner menu. 
The problem is that the Pancake House implements their menu with ArrayList, while the Diner implements their menu with Array.
They do not want to change their collections implemented already to hold their menu items since there are huge dependencies on their code. 
However, with different types of collections, Waitress implementation will be hard to maintain and extend.

Thus, the goal is to find a way to allow them to implement the same interface for their menus.
That way we can minimize the concrete references in the Waitress code and also hopefully get rid of the multiple loops required to iterate over both menus.


## Diagram
![IteratorFromScratch](IteratorFromScratch.svg)


## References
* Head First Design Patterns
