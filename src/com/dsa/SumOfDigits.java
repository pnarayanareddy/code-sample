package com.dsa;

public class SumOfDigits {

    public static int sumOfDigitsAfterConvert(String s, int k) {
        // Step 1: Convert each character to its corresponding digit in the alphabet
        StringBuilder digits = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            int digitValue = ch - 'a' + 1;  // Convert char to its alphabet position
            digits.append(digitValue);
        }

        // Step 2: Sum the digits of the converted result
        int sum = 0;
        for (char ch : digits.toString().toCharArray()) {
            sum += ch - '0';  // Convert character to a digit and sum them
        }

        // Step 3: Repeat summing the digits for k iterations
        while (k-- > 1) {
            sum = getDigitSum(sum);
        }

        return sum;
    }

    // Helper function to sum the digits of a number
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // Extract the last digit and add it to sum
            num /= 10;        // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example test case
        String s = "leetcode";
        int k = 2;
        System.out.println(sumOfDigitsAfterConvert(s, k));  // Output: 6
    }
}
