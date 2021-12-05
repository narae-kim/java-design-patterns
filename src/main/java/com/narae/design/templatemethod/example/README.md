# The Template Method Pattern
**The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. 
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.**


## Example of the Template Method Pattern: the structure of the CaffeineBeverage
* The CaffeineBeverage class maximizes reuse among the subclasses.
  - The algorithm lives in one place and code changes only need to be made there.

* The CaffeineBeverage class concentrates knowledge about the algorithm and relies on subclasses to provide complete implementations.

* The Template Method provides a framework that other caffeine beverages can be plugged into.
New caffeine beverages only need to implement a couple of methods.

### Diagram
![CaffeineBeverage](TemplateMethodExample.svg)


## References
* Head First Design Patterns
