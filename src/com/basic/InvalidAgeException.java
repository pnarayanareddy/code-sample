package com.basic;

//Custom checked exception class
public class InvalidAgeException extends Exception {
 // Constructor without parameters
 public InvalidAgeException() {
     super("Invalid age provided."); // Default error message
 }

 // Constructor with a custom error message
 public InvalidAgeException(String message) {
     super(message);
 }
}
