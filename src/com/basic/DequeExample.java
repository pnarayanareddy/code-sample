package com.basic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque using ArrayDeque
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the front and back of the Deque
        deque.addFirst("Front 1");
        deque.addLast("Back 1");
        deque.addFirst("Front 2");
        deque.addLast("Back 2");

        // Displaying the elements of the Deque
        System.out.println("Deque: " + deque);

        // Removing elements from the front and back of the Deque
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());

        // Displaying the elements of the Deque after removal
        System.out.println("Deque after removal: " + deque);

        // Checking if the Deque is empty
        System.out.println("Is the deque empty? " + deque.isEmpty());
    }
}
