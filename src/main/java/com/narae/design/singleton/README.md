# The Singleton Pattern
The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
 
 
***Use cases*** (where only one copy should exist):
- Shared resource
  - An object that contains registry settings
- When managing pools of resources
  - Thread pools
  - Where multiple connections are not allowed
- Spring Beans
- Lambda expression beyond Java 8


***Downsides*** of this singleton design:
  - Mocking not able since it is static

***Alternatives*** for where this singleton design does not fit:
- Enum
- Inner class holder pattern
  - It stops race conditions
- `java.util.concurrent` API instead of `synchronized`


## Thread NOT safe scenario
```
public static Singleton {
    private static Singleton oneAndOnlyOneObject;

    private Singleton() {}

        public static Singleton getInstance() {  // (1)
            if (oneAndOnlyOneObject == null) {   // (2)
                oneAndOnlyOneObject = new Singleton();  // (3)
            }
            return oneAndOnlyOneObject;  // (4)
        }
}
```

```
Thread1 | Thread2 | Value of oneAndOnlyOneObject
  (1)   |         |           null
        |   (1)   |           null
  (2)   |         |           null
        |   (2)   |           null
  (3)   |         |         <object1>
  (4)   |         |         <object1>
        |   (3)   |         <object2>
        |   (4)   |         <object2>
```

### Solution 1
```
        public static synchronized Singleton getInstance() {
            if (oneAndOnlyOneObject == null) { 
                oneAndOnlyOneObject = new Singleton();
            }
            return oneAndOnlyOneObject;
        }
```
We can enhance the thread safety by introducing the `synchronized` keyword

**Problem**: synchronization is expensive! After the first time we instantiate the Singleton variable, no further sync is needed for this method. Otherwise, it will become unnecessary overhead.

**Note**: synchronizing a method can decrease performance by a factor of 100, so if a high traffic part of your code begins using getInstance(), then consider Solution 2 or Solution 3.

### Solution 2
```
public static Singleton {
    // eagar loading or eagar instantiation
    // create an instance of Singleton in a static initializer
    private static Singleton oneAndOnlyOneObject = new Singleton();

    private Singleton() {}

        public static Singleton getInstance() {
            return oneAndOnlyOneObject;
        }
}
```
If your application always needs an instance of the Singleton or the overhead of creation and runtime aspects of the Singleton are not too bad, you can try *the eager instantiation*.
Using this approach,the JVM to create the unique instance of the Singleton when the class is loaded before any thread accesses the static variable.

### Solution 3
```
public class Singleton {
    private volatile static Singleton oneAndOnlyOneObject;

    private Singleton() {}

    public static Singleton getInstance() {
        if (oneAndOnlyOneObject == null) {
            synchronized (Singleton.class) {
                if (oneAndOnlyOneObject == null) {
                    oneAndOnlyOneObject = new Singleton();
                }
            }
        }
        return oneAndOnlyOneObject;
    }
}
```
This is called "double-checked locking".
We first check to see if an instance is created, and if not, THEN we synchronize. This way, we only synchronize the first time through.

*Reference*: Head First Design Patterns