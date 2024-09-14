package com.basic;

import java.util.ArrayList;

public class HeterogeneousExample {
    public static void main(String[] args) {
        // Creating an ArrayList that can hold elements of different types (heterogeneous data structure)
        ArrayList<Object> mixedList = new ArrayList<>();

        // Adding different types of elements to the ArrayList
        mixedList.add("Hello");      // String
        mixedList.add(123);          // Integer
        mixedList.add(45.67);        // Double
        mixedList.add(true);         // Boolean

        // Accessing and printing elements of the heterogeneous ArrayList
        for (Object element : mixedList) {
            System.out.println(element);
        }
    }
}
