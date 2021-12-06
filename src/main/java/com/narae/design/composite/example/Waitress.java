package com.narae.design.composite.example;

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
}
