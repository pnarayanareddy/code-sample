package com.dsa;

public class AnagramChecker2 {

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[26];  // For lowercase English letters
        
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1, s2));  // Output: true
    }
}
