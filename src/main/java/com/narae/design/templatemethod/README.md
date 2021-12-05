# The Template Method Pattern
**The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. 
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.**

* The Template Method pattern creates a template as a method for an algorithm with a set of steps.
  - One or more of these steps is defined to be abstract and implemented by a subclass.
  - It ensures the algorithm's structure stays unchanged, while subclasses provide some part of the implementation.

* There is a trade off:
  - The more granularity, the more override a subclass needs to implement.
  - The less granularity, the less flexibility.

* The Template Method pattern encapsulates an algorithm by inheritance, while the Strategy pattern encapsulates an algorithm by composition.

* The Factory Method is a specialization of Template Method.


## Diagram
![TemplateMethod](TemplateMethod.svg)

* The AbstractClass contains the template method.
* The template method makes use of the primitiveOperations to implement an algorithm.
  - It is decoupled from the actual implementation of these operations.
* The ConcreteClass implements the abstract operations, which are called when the templateMethod() needs them.
* There may be many ConcreteClasses, each implementing the full set of operations required by the template method.

## Design Principle
### The Hollywood Principle
**Don't call us, we will call you.**

* The Hollywood principle guides us to put decision-making in high-level modules that can decide how and when to call low level modules.

* The Hollywood principle gives us a way to prevent "dependency rot". 
  - Dependency rot happens when you have high-level components depending on low-level components depending on high-level components depending on sideways components depending on low-level components, and so on.
  - When rot sets in, no one can easily understand the way a system is designed.
  
* The Hollywood principle allows low-level components to hook themselves into a system, but the high-level components determine when they are needed and how.

#### Example: `com.narae.design.templatemethod.example` package
* CaffeineBeverage is the high-level component. It has control over the algorithm for the recipe, and calls on the subclasses only when they are needed for an implementation of a method.

* Clients of beverages will depend on the CaffeineBeverage abstraction rather than a concrete Tea or Coffee, which reduces dependencies in the overall system.

* The subclasses are used simply to provide implementation details.

* The subclasses never call the abstract class directly without being called first.



## Example: Sort in Java Arrays
Further details on the `java.util.Arrays` class and the `com.narae.design.templatemethod.sortexample` package.

The `sort()` method controls the algorithm and no class can change it.
The `sort()` counts on a Comparable interface to provide the implementation of `compareTo()`.

```java
public class Arrays {
    public static void sort(Object[] a) {
        if (LegacyMergeSort.userRequested)
            legacyMergeSort(a);
        else
            ComparableTimSort.sort(a, 0, a.length, null, 0, 0);
    }
    // This method is just a helper method that passes a copy of the array along as the destination array to the mergeSort() method.
    private static void legacyMergeSort(Object[] a) {
        Object[] aux = a.clone();
        mergeSort(aux, a, 0, a.length, 0);
    }
    // The mergeSort() method contains the sort algorithm, and relies on an implementation of the compareTo() method to complete the algorithm.
    // Consider it as the TEMPLATE METHOD.
    private static void mergeSort(Object[] src, Object[] dest, int low, int high, int off) {
        int length = high - low;
        if (length < INSERTIONSORT_THRESHOLD) {
            for (int i=low; i<high; i++)
                for (int j=i; j>low &&
                         ((Comparable) dest[j-1]).compareTo(dest[j])>0; j--)  // compareTo() method needs to be implemented for the template method.
                    swap(dest, j, j-1);  // Concrete method which is already defined in the Arrays class.
            return;
        }
        // and more
    }
    // and more
}
```


## References
* Head First Design Patterns
