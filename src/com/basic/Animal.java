package com.basic;

public class Animal {
    public void printClassName() {
        System.out.println("Class: " + this.getClass().getName());
    }
}

public class Dog extends Animal {
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.printClassName();  // Output: Class: Animal
        dog.printClassName();     // Output: Class: Dog
    }
}
