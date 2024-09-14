package com.basic;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList (Queue is an interface, so we use a concrete implementation)
        Queue<String> queue = new LinkedList();

        // Adding elements to the Queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Displaying the head of the Queue
        System.out.println("Head of the queue: " + queue);

        // Removing elements from the Queue (FIFO order)
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        // Displaying the head of the Queue after removal
        System.out.println("Head of the queue after removal: " + queue);

        // Checking if the Queue is empty
    //    System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
