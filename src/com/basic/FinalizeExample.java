package com.basic;

public class FinalizeExample {
    // Acquire resource in constructor
    public FinalizeExample() {
        System.out.println("Resource acquired");
    }

    // Release resource in finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource released in finalize");
        super.finalize();  // Always call super.finalize() at the end
    }

    public static void main(String[] args) {
        FinalizeExample res = new FinalizeExample();
        res = null;  // Make the resource eligible for GC
        System.gc(); // Request GC (not guaranteed to run immediately)
    }
}
