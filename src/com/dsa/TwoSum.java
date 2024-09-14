package com.dsa;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // HashMap to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

