package com.narae.design.templatemethod.sortexample;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        // An array of Ducks
        Duck[] ducks = {new Duck("Ducky", 3), new Duck("Donald", 4), new Duck("Maggie", 2)};

        System.out.println("Before sorting:");
        display(ducks);

        // Arrays static method sort()
        Arrays.sort(ducks);
        System.out.println("After sorting:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
