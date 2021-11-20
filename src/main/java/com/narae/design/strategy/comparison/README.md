As AI inherits Genius class, AI class also have the eat() method which doesn't make sense.

So what is your approach?

## Approach 1. Override the eat() method
```java
public class AI extends Genius {
    @Override
    public void introduce() {
        System.out.println("This is the best Artificial Intelligence ever! I am a genius.");
    }
    public void eat(){}  // AI cannot eat
}
```
 
 ## Approach 2. Interface
We know the spec will keep changing and possibly override eat() and showOff() for every new Genius subclass.

See the diagram.

Good? Bad? We have to duplicate code in all subclasses... 
