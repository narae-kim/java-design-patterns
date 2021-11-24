# java-design-patterns
The `java-design-patterns` project aims to explain well-known design patterns in Java as well as to demonstrate some examples. 

## Goal
We, software developers, inevitably need to spend more time on maintaining the existing system,
rather than developing the initial system. The reasons are many. But we expect to have new requirements every so often.

Since Java is the Object-Oriented (OO) language, there are advantages that can prevent some unexpected changes on the existing code.
Updating existing code may cause bugs or waste time to update more code to align with the new code. 
Thus, designing a system well is important to not touch the existing code even though we have to meet a new requirement.

Design patterns can give us guidelines to design a system more flexible, i.e., reusable, extensible and maintainable so that it can cope with change.


## Design principles
Student: Yes, Master. While inheritance is powerful, I have
learned that it doesn’t always lead to the most flexible or
maintainable designs.
Master: Ah yes, you have made some progress. So, tell me my student, how
then will you achieve reuse if not through inheritance?
Student: Master, I have learned there are ways of “inheriting” behavior at
runtime through composition and delegation.
Master: Please, go on...
Student: When I inherit behavior by subclassing, that behavior is set statically
at compile time. In addition, all subclasses must inherit the same behavior. If
however, I can extend an object’s behavior through composition, then I can do
this dynamically at runtime.
Master: Very good, Grasshopper, you are beginning to see the power of
composition.
Student: Yes, it is possible for me to add multiple new responsibilities to objects
through this technique, including responsibilities that were not even thought of
by the designer of the superclass. And, I don’t have to touch their code!
Master: What have you learned about the effect of composition on maintaining
your code?
Student: Well, that is what I was getting at. By dynamically composing objects,
I can add new functionality by writing new code rather than altering existing
code. Because I’m not changing existing code, the chances of introducing bugs
or causing unintended side effects in pre-existing code are much reduced.



## Reference
* Head First Design Patterns