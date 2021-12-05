package com.narae.design.singleton;

/**
 * The Singleton pattern gives us a global point of access. Of course other instance variables and methods are allowed.
 * The object can be created only when it is needed
 *  - what if the object is resource intensive and your application never ends up using it? the lazy instantiation!
 *
 * Use cases:
 *  - an object that contains registry settings (we want only one copy!)
 *  - when managing pools of resources, e.g. connection or thread pools
 *
 * Definition:
 * The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
 */
public class Singleton {
    /**
     * static variable can hold only one class level instance
     * 'volatile' keyword ensures that multiple threads handle the oneAndOnlyOneObject variable correctly
     * when it is being initialised to the Singleton instance.
     */
    private volatile static Singleton oneAndOnlyOneObject;

    /**
     * private constructor makes the class not able to be instantiated other than the class itself (prevent 'new' operator to the class).
     */
    private Singleton() {}

    /**
     * static method is a class level method. Use the class name to reference a static method, i.e. Singleton.getInstance();
     * @return ensured one and the only object of the class itself
     */
    public static Singleton getInstance() {
        if (oneAndOnlyOneObject == null) {  // thread-safe  // volatile keyword required
            synchronized (Singleton.class) {  // thread-safe
                if (oneAndOnlyOneObject == null) {
                    oneAndOnlyOneObject = new Singleton();
                }
            }
        }
        return oneAndOnlyOneObject;
    }
}
