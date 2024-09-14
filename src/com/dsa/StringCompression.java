package com.dsa;

public class StringCompression {

    public static int compress(char[] chars) {
        int index = 0;  // Index to modify the original array
        int i = 0;      // Index to iterate over the array
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            // Count the number of occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            
            // Add the character to the compressed array
            chars[index++] = currentChar;
            
            // If the character occurs more than once, append the count
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index;  // New length of the compressed string
    }

    public static void main(String[] args) {
        // Example test case
        char[] chars = {'a', 'a', 'b', 'c', 'c', 'c', 'c', 'c', 'a', 'a', 'a'};
        int newLength = compress(chars);
        
        // Print the compressed result and the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("New length: " + newLength);
    }
}
