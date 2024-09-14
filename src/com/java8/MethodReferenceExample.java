package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.BiFunction;

class Calculator {
    // Static method for method reference
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method for method reference
    public int multiply(int a, int b) {
        return a * b;
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        // 1. Reference to a static method
        BiFunction<Integer, Integer, Integer> staticMethodRef = Calculator::add;
        int sum = staticMethodRef.apply(10, 20);
        System.out.println("Sum using static method reference: " + sum);

        // 2. Reference to an instance method of a particular object
        Calculator calculator = new Calculator();
        BiFunction<Integer, Integer, Integer> instanceMethodRef = calculator::multiply;
        int product = instanceMethodRef.apply(3, 4);
        System.out.println("Product using instance method reference: " + product);

        // 3. Reference to an instance method of an arbitrary object of a particular type
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println); // prints each name in the list

        // 4. Reference to a constructor
        Function<String, Person> constructorRef = Person::new;
        Person person = constructorRef.apply("David");
        System.out.println("Created person with name: " + person.name);
    }
}
