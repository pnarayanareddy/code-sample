package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfSubarray {
    // Function to find the median of the subarray
    public static int findMedian(int[] arr, int L, int R) {
        // Extract the subarray
        int[] subarray = Arrays.copyOfRange(arr, L - 1, R); // Converting to 0-indexed
        
        // Sort the subarray
        Arrays.sort(subarray);
        
        // Find the median
        int length = subarray.length;
        int medianIndex = length / 2; // For both odd and even, this will give us the correct index
        
        return subarray[medianIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size and elements
        int n = sc.nextInt(); // Size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the number of queries
        int q = sc.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println(findMedian(arr, L, R));
        }
        
        sc.close();
    }
}
