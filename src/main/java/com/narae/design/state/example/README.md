# The State Pattern
**The State Pattern allows an object to alter its behavior when its internal state changes. 
The object will appear to change its class.**


## Example scenarios
We write a simulator for a gumball machine. Now a new requirement comes to handle a new event: *10% chances of getting two gumballs instead of one*.

The first approach for the simulator was bad as shown in `com.narae.design.state.example.BadGumballMachine`.
It was modeling state within an object by creating an instance variable to hold the state values and writing conditional code within the methods to handle the various states.
It turned out the design was against the "encapsulate what varies" principle when the new requirement came. It needed to change the conditional statements, and so on.

Thus, the new solution (the State Pattern) came to localize the behavior for each state so that if we make changes to one state, we do not run the risk of messing up the other code.
Now, every state just implements its own actions in their class.

Also, in terms of the "favor composition over inheritance" principle, the Gumball Machine can just delegate to the state object that represents the current state.


From the Bad Gumball Machine example to the new Gumball Machine example, the functionality is exactly the same but they are structurally different.
In the new implementation ...
- Localized the behavior of each state into its own class.
- Removed all the troublesome `if` statements that would have been difficult to maintain.
- Closed each state for modification, and yet left the Gumball Machine open to extension by adding new state classes.
- Created a code base and class structure that maps much more closely to the Gumball diagram and is easier to read and understand.

The Gumball Machine now holds an instance of each State class. When an action is called, it is delegated to the current state.


## Diagram
![StateExample](StateExample.svg)


## References
* Head First Design Patterns
