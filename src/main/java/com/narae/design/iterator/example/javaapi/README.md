# The Iterator Pattern
**The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.**

## The Iterator by `java.util.Iterator` and `java.util.Collection`
* Java built-in collection classes allow you to store and retrieve groups of objects.
Almost all of them support a way to obtain an Iterator.
  - Any class that implements the `java.util.Collection` interface can give an Iterator.
  - Calling `iterator()` on, for example, an ArrayList returns a concrete Iterator made for ArrayLists, but you do not need to know about the concrete class it uses.
  You can just use the Iterator interface.


* Collections also support for iterating without an iterator beyond Java 5.
```java
for (Object obj: collection) {
    ...
}
```


## Example scenarios
The Pancake House needs to merge their menu with the Diner menu. And now the Cafe menu too.
The problem is that the Pancake House implements their menu with ArrayList, while the Diner implements their menu with Array and the Cafe implements the menu in Hashtable.
They do not want to change their collections implemented already to hold their menu items since there are huge dependencies on their code. 
However, with different types of collections, Waitress implementation will be hard to maintain and extend.

Thus, the goal is to find a way to allow them to implement the same interface for their menus.
That way we can minimize the concrete references in the Waitress code and also hopefully get rid of the multiple loops required to iterate over both menus.


## Diagram
![IteratorWithJavaAPI](IteratorWithJavaAPI.svg)

Using Java built-in Iterator gives us many advantages.

## References
* Head First Design Patterns

