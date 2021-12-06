package com.narae.design.iterator.example.scratch;

/**
 * Each concrete Menu is responsible for creating the appropriate concrete Iterator class.
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    // Array - it can control the max size of the menu and retrieve menu items out without having to cast its objects.
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian Sandwich", "Cheese, lettuce and tomato on whole wheat", true, 5.99);
        addItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 6.99);
        addItem("Soup of the day", "Soup of the day with a side of potato salad", false, 3.99);
        addItem("Hotdog", "A hotdog with saurkraut, relish, onions, topped with cheese", false, 7.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! We cannot add item to menu.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    /* NOT WANTED - it exposes the internal implementation
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
     */

    /**
     * The client does not need to know how the menuItems are maintained in the DinerMenu, nor does it need to know how the DinerMenuIterator is implemented.
     *
     * @return Iterator
     */
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
