# The Observer Pattern
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

## The observer Pattern by Java built-in API
Java has built-in support for the observer pattern in several of its APIs.
For instance, there is a built-in Java Observer Pattern that allows you to use either push or pull.
With Java’s built-in support, all you have to do is extend Observable and tell it when to notify the Observers. The API does the rest for you.

### java.util - Legacy API
The built-in class `java.util.Observable` is no longer valid since the class has been deprecated.

The built-in interface `java.util.Observer` is no longer valid since the interface has been deprecated.

***References***
- https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Observable.html
- https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Observer.html

These are quite similar to our Subject and Observer interface, but give you a lot of functionality out of the box. 
We can also implement either a push or pull style of update to the observers.


The most obvious difference is that TelemetryData (subject) extends the Observable class and inherits the add, delete and notify Observer methods.

**For an object to become an observer, implement the Observer interface** by `java.util.Observer` 
and call `addObserver()` on any Observable object. Similarly, call `deleteObserver()` to remove the observer.

**For the Observable to send notifications, extend the Observable superclass** by `java.util.Observable`.
Then, firstly, MUST call the `setChanged()` method to signify that the state has changed in your object.
Secondly, call one of two `notifyObservers()` methods - either `notifyObservers()` or `notifyObservers(Object arg)`.
For the argument `(Object) arg` it can be an arbitrary data object that gets passed to each Observer when it is notified.

**For an Observer to receive notifications, it implements the update method.**

`update(Observable observable, Object arg)`

The argument `(Observable) observable` is the Subject that sent the notification is passed in as this argument.
The argument `(Object) arg` will be the data object that was passed to `notifyObservers(Object arg)`, or `null` if a data object wasn't specified.

If you want to “push” data to the observers you can pass the data as a data object to the `notifyObserver(arg)` method. 
If not, then the Observer has to “pull” the data it wants from the Observable object passed to it.

