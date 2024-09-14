package com.dsa;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        // HashSet to store unique characters
        HashSet<Character> set = new HashSet<>();
        
        int maxLength = 0;
        int i = 0;  // Left pointer
        
        // Right pointer (j) iterates through the string
        for (int j = 0; j < s.length(); j++) {
            // If character at j is already in the set, move the left pointer (i)
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            // Add the current character at j to the set
            set.add(s.charAt(j));
            // Calculate the maximum length of the substring
            maxLength = Math.max(maxLength, j - i + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(s));  // Output: 3
    }
}
