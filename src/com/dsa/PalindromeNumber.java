package com.dsa;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        // Special cases:
        // 1. If x is negative, it's not a palindrome.
        // 2. If x ends with 0 and is not 0 itself, it's not a palindrome.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // If the original number is even length, they should be the same.
        // If odd, the middle digit can be ignored by reversedHalf/10.
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 494;
        int num3 = 9009;

        System.out.println(isPalindrome(num1));  // Output: true
        System.out.println(isPalindrome(num2));  // Output: false
        System.out.println(isPalindrome(num3));  // Output: false
    }
}
