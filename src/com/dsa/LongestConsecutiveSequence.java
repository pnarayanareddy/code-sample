package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        // Add all numbers to the set
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        // Iterate through each number in the set
        for (int num : numSet) {
            // Only check for start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check for consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the maximum length found
                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence sequenceFinder = new LongestConsecutiveSequence();
        int[] array = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + sequenceFinder.longestConsecutive(array)); 
        // Output: 4, because the longest sequence is [1, 2, 3, 4]
    }
}
