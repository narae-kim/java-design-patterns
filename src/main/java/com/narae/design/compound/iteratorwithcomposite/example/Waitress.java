package com.narae.design.compound.iteratorwithcomposite.example;

import java.util.Iterator;

/**
 * The Waitress is going to use the MenuComponent interface to access both Menus and MenuItems.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * Print the entire menu hierarchy - all the menus and all the menu items.
     */
    public void printMenu() {
        allMenus.print();
    }

    /**
     * The try/catch should be for error handling, not program logic.
     * - Check the runtime type of the menu component with "instanceof" to make sure it is a MenuItem before calling isVegetarian().
     *   - Then we lose transparency because we didn't treat Menu and MenuItem uniformly.
     * - Change isVegetarian() in Menu so that it returns false.
     *   - Simple solution and we keep our transparency.
     *
     * Here the purpose is to show that this is an unsupported operation on the Menu.
     * - Also this approach allows to implement a reasonable isVegetarian() method for Menu and have it work with the existing code.
     */
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();  // CompositeIterator
        System.out.println("\nVEGETARIAN MENU\n-----------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();  // only on MenuItem
                }
            } catch (UnsupportedOperationException e) {  // continue on Menu
            }
        }
    }
}
