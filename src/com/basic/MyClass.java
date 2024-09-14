package com.basic;


public class MyClass {
    public void showMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Creating and using an anonymous object
        new MyClass().showMessage("Hello, World!");

        // Another example with method chaining
        //new MyClass().showMessage("Hello").showMessage("World");
    }
}



