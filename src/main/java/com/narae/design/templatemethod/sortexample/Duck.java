package com.narae.design.templatemethod.sortexample;

/**
 * The sort template method in java.util.Arrays gives us the algorithm, but this class needs to tell it how to compare ducks by implementing compareTo() method.
 * Since the class is not a subclass of the template abstract class, the sort() method needs to know that compareTo() method is implemented, so the Comparable interface is used.
 */
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * For sorting.
     *
     * @param o which is another Duck to compare this duck to.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        // Specify how Ducks compare.
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
