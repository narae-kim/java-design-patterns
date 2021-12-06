package com.narae.design.composite;

/**
 * A Leaf has no children.
 * A Leaf defines the behavior for the elements in the composition by implementing the operations the Composite supports.
 * The Leaf inherits methods like add(), remove() and getChild(), which don't necessarily make a lot of sense for a leaf node.
 */
class Leaf extends Component {
    @Override
    void operation() {
        System.out.println("Leaf operation");
    }
}
