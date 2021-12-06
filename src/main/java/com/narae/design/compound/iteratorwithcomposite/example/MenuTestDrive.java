package com.narae.design.compound.iteratorwithcomposite.example;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
        // Top-level menu
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("Narae's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 8.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", false, 8.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 7.99));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 8.50));

        dinerMenu.add(new MenuItem("Vegetarian Sandwich", "Cheese, lettuce and tomato on whole wheat", true, 5.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 6.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day with a side of potato salad", false, 3.99));
        dinerMenu.add(new MenuItem("Hotdog", "A hotdog with saurkraut, relish, onions, topped with cheese", false, 7.99));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 7.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day with a side salad", false, 3.99));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 8.99));

        // Add a menu to a menu.
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 3.99));
        dessertMenu.add(new MenuItem("Cheese cake", "Creamy New York cheese cake with a chocolate graham crust", true, 3.99));
        dessertMenu.add(new MenuItem("Sorbet", "A Scoop of raspberry and a scoop of lime", true, 3.50));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
