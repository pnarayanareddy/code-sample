package com.dsa;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        // Trim the input string and split it by whitespace
        String[] words = s.trim().split("\\s+");
        
        // Reverse the array of words
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println(reverseWords(s1));  // Output: "blue is sky the"
        System.out.println(reverseWords(s2));  // Output: "world hello"
        System.out.println(reverseWords(s3));  // Output: "example good a"
    }
}

