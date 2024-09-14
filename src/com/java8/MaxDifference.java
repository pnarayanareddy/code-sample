package com.java8;

import java.util.Arrays;

public class MaxDifference {
    public static int findMaxDifference(int[] arr) {
        return Arrays.stream(arr)
                     .reduce((min, max) -> Math.min(max - min, max))
                     .orElse(0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2 , 3, 4};
        System.out.println(findMaxDifference(arr)); // Output: 8
    }
}

