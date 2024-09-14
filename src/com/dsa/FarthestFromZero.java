package com.dsa;

public class FarthestFromZero {
    public static int farthestFromZero(int[] arr) {
        // Initialize variables to keep track of the farthest element
        int farthest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Check if the current element has a larger absolute value
            if (Math.abs(arr[i]) > Math.abs(farthest)) {
                farthest = arr[i];
            }
            // If they are equal in absolute value, choose the lesser number
            else if (Math.abs(arr[i]) == Math.abs(farthest) && arr[i] < farthest) {
                farthest = arr[i];
            }
        }

        return farthest;
    }

    public static void main(String[] args) {
        int[] arr = {3, -10, 20, 15, -20};
        System.out.println("Farthest from zero: " + farthestFromZero(arr));
    }
}
