package com.dsa;

public class FindMinInRotatedSortedArray {
    
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        // Binary search approach
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than the rightmost element, the min is on the right side
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Otherwise, the minimum is in the left part (including mid)
            else {
                right = mid;
            }
        }
        
        // The loop exits when left == right, which is the index of the smallest value
        return nums[left];
    }

    public static void main(String[] args) {
        // Example test cases
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums1));  // Output: 1

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums2));  // Output: 0

        int[] nums3 = {11, 13, 15, 17};
        System.out.println(findMin(nums3));  // Output: 11
    }
}
