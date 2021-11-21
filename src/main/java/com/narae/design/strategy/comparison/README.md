# Problem set
I have a system that contains the genius relationship. Previously, Genius can greet, show off, and introduce themselves.

Then, the new requirement came that Genius should eat too. So I implemented `eat()` method.

As AI inherits Genius class, AI class also have the eat() method which doesn't make sense.

So what is your approach to fix the bug?


## Approach 1. Override the eat() method
One of the easiest approaches can be just overriding the `eat()` method to empty body for all non-animal geniuses.
```java
public class AI extends Genius {
    @Override
    public void introduce() {
        System.out.println("This is the best Artificial Intelligence ever! I am a genius.");
    }
    public void eat(){}  // AI cannot eat
}
```
 ![GivenStructure](GivenStructure.svg)

This is a pretty good approach. However, there is no guarantee that, say, MachineLearning genius will override `eat()` method.
Also, that can be easily forgettable which means this approach is error prone.

 ## Approach 2. Interface
Another approach is using interface. 

Also, we know the spec will keep changing and possibly override `eat()` and `showOff()` for every new Genius subclass. 


![Interface](ApplyingSimpleInterface.svg)

Is this approach Good or Bad? 

Using an interface is a good idea but we have to duplicate code in all the subclasses...

## Approach 3. Strategy Pattern
The best approach can be using the strategy pattern.

Go to `com.narae.design.strategy.example` for more details.  
