package com.narae.design.composite;

import java.util.ArrayList;

/**
 * The Composite's role is to define behavior of the components having children and to store child components.
 * The Composite implements the Leaf-related operations. Some of these may not make sense on a Composite, so in that case an exception might be generated.
 */
class Composite extends Component {
    ArrayList<Component> components = new ArrayList<>();

    @Override
    void add(Component component) {
        components.add(component);
    }

    @Override
    void remove(Component component) {
        components.remove(component);
    }

    @Override
    Component getChild(int ind) {
        return components.get(ind);
    }

    @Override
    void operation() {
        System.out.println("Composite operation");
    }
}
