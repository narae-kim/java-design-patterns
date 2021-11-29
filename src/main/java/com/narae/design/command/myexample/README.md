# The Command Pattern
The Command Pattern encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

When you need to decouple an object making requests from the objects that know how to perform the requests, use the Command Pattern.

* The Command Pattern allows us to encapsulate methods into Command objects: store them, pass them around, and invoke them when you need them. 

* The Command Pattern supports the decoupling of the invoker of a request and the receiver of the request.

* A Command object is at the center of this decoupling and encapsulates a receiver with an action or set of actions.

* From the outside, no other objects really know what actions get performed on what receiver; they just know that if they call the `execute()` method, their request will be serviced.


## Example scenario 




## Diagram

