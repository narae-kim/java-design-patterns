# The Command Pattern
The Command Pattern encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

When you need to decouple an object making requests from the objects that know how to perform the requests, use the Command Pattern.

* The Command Pattern allows us to encapsulate methods into Command objects: store them, pass them around, and invoke them when you need them. 

* The Command Pattern supports the decoupling of the invoker of a request and the receiver of the request.

* A Command object is at the center of this decoupling and encapsulates a receiver with an action (or set of actions) .

* From the outside, no other objects really know what actions get performed on what receiver; they just know that if they call the `execute()` method, their request will be serviced.

```java
public interface Command {
    void execute();
    /* An encapsulated Request
    execute() {
        receiver.action();
    }            
    */            
}
```


## Diagram
![CommandPattern](CommandPattern.svg)


## Flow
### Initialisation
* **Client**: The client is responsible for **creating the command object**. The command object consists of a set of actions on a receiver.
    - `createCommandObject()`: The client creates a command object.
        - The actions and the Receiver are bound together in the command object.

* **Command**: The command object provides one method, `execute()`, that encapsulates the actions and can be called to invoke the actions on the Receiver.
    - `setCommand()`: The client calls `setCommand()` on an Invoker object and passes it the command object to store the command object in the invoker.
    
* **Invoker**: At some point in the future the Invoker calls the command object's `execute()` method.

### Execution
* **Client**: The client asks the invoker to execute the command. 
    - Once the command is loaded into the invoker, it may be used and discarded, or it may remain and be used many times.

* **Invoker**: The invoker calls `execute()` on the command.

* **Command**: The `execute()` method triggers the actions on the receiver.

* **Receiver**: The actions on the receiver are invoked.

## Usecases
### Queuing requests
Commands give us a way to package a piece of computation (a receiver and a set of actions) and pass it around as a first-class object.
We can take this scenario and apply it to many useful applications such as schedulers, thread pools and job queues.

Imagine a job queue: you add commands to the queue on one end, and on the other end sit a group of threads.
Threads run the following script: they remove a command from the queue, call its execute() method, wait for the call to finish, then discard the command object and retrieve a new one.

Note that the job queue classes are totally decoupled from the objects that are doing the computation.

The job queue objects just retrieve commands and call `execute()`.
Likewise, as long as you put objects into the queue that implement the Command Pattern, your `execute()` method will be invoked when a thread is available.


### Logging requests
The semantics of some applications require that we log all actions and be able to recover after a crash by reinvoking those actions. 
The Command Pattern can support these semantics with the addition of two methods: `store()` and `load()`.
In Java we could use object serialization to implement these methods, but the normal caveats for using serialization for persistence apply.

How does this work? As we execute commands, we store a history of them on disk.
When a crash occurs, we reload the command objects and invoke their `execute()` methods in batch and in order.

By using logging, we can save all the operations since the last check point, and if there is a system failure, apply those operations to our checkpoint, for example, a spreadsheet application.
After a system failure, the objects are reloaded and executed in the correct order.

## *The Meta Command Patten*
The Meta Command Pattern allows you to create macros of commands so that you can execute multiple commands at once.
 

## References
* Head First Design Patterns
