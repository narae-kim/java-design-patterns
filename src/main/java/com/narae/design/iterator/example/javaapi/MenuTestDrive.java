package com.narae.design.iterator.example.javaapi;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(new ArrayList(List.of(pancakeHouseMenu, dinerMenu, cafeMenu)));
        waitress.printMenu();
    }
}
