package com.narae.design.iterator.example.javaapi;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Waitress is decoupled from the implementation by using the same interface, Iterator, to iterate over menu items.
 */
public class Waitress {
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;
//    Menu cafeMenu;
    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//        this.cafeMenu = cafeMenu;
//    }

    public void printMenu() {
//        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator dinerIterator = dinerMenu.createIterator();
//        Iterator cafeIterator = cafeMenu.createIterator();
//
//        System.out.println("MENU\n-----------\nBREAKFAST");
//        printMenu(pancakeIterator);
//
//        System.out.println("\nLUNCH");
//        printMenu(dinerIterator);
//
//        System.out.println("\nDINNER");
//        printMenu(cafeIterator);
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    /**
     * Overloaded printMenu() with the Iterator to step through the menu items and print them.
     *
     * @param iterator
     */
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
