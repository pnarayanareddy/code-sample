package com.basic;

public class CustomExceptionExample {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older to register.");
        } else {
            System.out.println("Age is valid for registration.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);  // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            validateAge(20);  // This will not throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
