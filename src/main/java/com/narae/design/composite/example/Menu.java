package com.narae.design.composite.example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The Composite class in the Composite diagram that can hold leaves or other composites.
 * Menu overrides the methods that make sense from its menuComponents.
 */
public class Menu extends MenuComponent {
    // Menu can have any number of children of type MenuComponent.
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int ind) {
        return menuComponents.get(ind);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * This method iterates through all the Menu's components which could be other menus or menu items.
     * Since both Menu and MenuItem implement print(), we just call print() and the rest is up to them.
     */
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
