# The Factory Method Pattern
The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.

## Example: Franchising the pizza store
### Scenario
We are franchising the pizza store across the country. Also, we decided to update the menu based on the regional preferences.
For example, we know people in New York prefer thin crust pizzas, while people in Chicago prefer thick crust pizzas.
However, we still need to preserve the processes we need to follow for the pizza stores.

### Approaches
* Create a framework that ties the store and the pizza creation together, yet still allows things to remain flexible.
* The `orderPizza()` method does a lot of things in common with a Pizza object such as `prepare()`, `bake()`, `cut()`, and `box()`, 
but because Pizza is abstract, `orderPizza()` has no idea what real concrete classes are involved. In other words, they are decoupled!
* The subclasses are not "deciding" a pizza but they determine which kind of pizza gets made once a client decides which store they want.

## Diagrams
### The Creator classes
![TheCreator](TheCreator.svg)


### The Product classes
![TheProduct](TheProduct.svg)


