# The Composite Pattern
**The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. 
Composite lets clients treat individual objects and compositions of objects uniformly.**


## Example scenario
Update menu from the `com.narae.design.iterator.example.javaapi` package to add a dessert submenu to the DinerMenu (menus within menus).

We need for the Diner menu to hold a submenu, but the original design was to assign a menu to a MenuItem array.
* To handle the different types, a tree shaped structure will accommodate menus, submenus and menu items.

We need to make sure we maintain a way to traverse the items in each menu that is at least as convenient as the original approaches with iterators.
* We may need to be able to traverse the items in a more flexible manner. 
For instance, either iterate over only the Diner’s dessert menu, or we might need to iterate over the Diner’s entire menu including the dessert submenu.


## Diagram
![CompositeExample](CompositeExample.svg)

The Composite Pattern gives us a way to create a tree structure that can handle a nested group of menus and menu items in the same structure.
By putting menus and items in the same structure we create a part-whole hierarchy; that is, a tree of objects made of parts (menus and menu items).
It can, of course, be treated as a whole, like one big über menu.


## References
* Head First Design Patterns
