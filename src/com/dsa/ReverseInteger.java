package com.dsa;

public class ReverseInteger {

    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int pop = x % 10;  // Extract the last digit
            x /= 10;  // Remove the last digit from the number

            // Check for overflow before actually appending the digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;  // Overflow case
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;  // Underflow case
            }

            reversed = reversed * 10 + pop;  // Append the digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        // Test cases
        int x1 = 123;
        System.out.println(reverse(x1));  // Output: 321

        int x2 = -123;
        System.out.println(reverse(x2));  // Output: -321

        int x3 = 120;
        System.out.println(reverse(x3));  // Output: 21

        int x4 = 1534236469;
        System.out.println(reverse(x4));  // Output: 0 (overflow case)
    }
}

