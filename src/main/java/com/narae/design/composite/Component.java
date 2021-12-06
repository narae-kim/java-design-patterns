package com.narae.design.composite;

/**
 * The Component defines an interface for all objects in the composition: both the composite and the leaf nodes.
 * The Component may implement a default behavior to add(), remove(), getChild() and its operations.
 */
abstract class Component {
    /**
     * TODO - Override the method properly.
     *
     * @param component
     */
    void add(Component component) {
    }

    /**
     * TODO - Override the method properly.
     *
     * @param component
     */
    void remove(Component component) {
    }

    /**
     * TODO - Override the method properly.
     *
     * @param ind
     * @return
     */
    Component getChild(int ind) {
        return null;
    }

    abstract void operation();
}
