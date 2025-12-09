package challenges.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Find Duplicate Element in Array
 * Find and return the duplicate element in an array where every element appears once except one appears twice.
 * 
 * Constraints: Array contains n+1 integers where n is from 1 to 10000
 * Example: Input: [1, 3, 4, 2, 2] => Output: 2
 */
public class FindDuplicate {

    // Approach 1: Using HashSet (Most common for interviews)
    // Time: O(n), Space: O(n)
    public static int findDuplicateHashSet(int[] nums) {
        // Create a set to track elements we've seen
        Set<Integer> seen = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If we already saw this number, it's the duplicate
            if (seen.contains(num)) {
                return num;
            }
            // Add number to the set if first time seeing
            seen.add(num);
        }
        
        // This shouldn't happen if input is valid
        return -1;
    }

    // Approach 2: Using Sorting (Space optimized)
    // Time: O(n log n), Space: O(1) if not counting sort space
    public static int findDuplicateSort(int[] nums) {
        // Sort the array first
        java.util.Arrays.sort(nums);
        
        // After sorting, duplicate will be adjacent
        for (int i = 0; i < nums.length - 1; i++) {
            // Check if current and next element are same
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        
        return -1;
    }

    // Approach 3: Using XOR (Most space efficient)
    // Time: O(n), Space: O(1)
    public static int findDuplicateXOR(int[] nums) {
        // XOR of two same numbers is 0
        // XOR of any number with 0 is the number itself
        int xor = 0;
        int xorExpected = 0;
        
        // XOR all numbers in array
        for (int num : nums) {
            xor ^= num;
        }
        
        // XOR all numbers from 1 to n (n = nums.length - 1)
        for (int i = 1; i < nums.length; i++) {
            xorExpected ^= i;
        }
        
        // XOR of both will give the duplicate number
        return xor ^ xorExpected;
    }

    // Test cases
    public static void main(String[] args) {
        // Test case 1
        int[] test1 = {1, 3, 4, 2, 2};
        System.out.println("Test 1 - HashSet: " + findDuplicateHashSet(test1)); // Output: 2
        System.out.println("Test 1 - Sort: " + findDuplicateSort(test1.clone())); // Output: 2
        System.out.println("Test 1 - XOR: " + findDuplicateXOR(test1)); // Output: 2
        
        // Test case 2
        int[] test2 = {1, 1};
        System.out.println("Test 2 - HashSet: " + findDuplicateHashSet(test2)); // Output: 1
        
        // Test case 3
        int[] test3 = {2, 5, 9, 4, 8, 3, 1, 7, 6, 5};
        System.out.println("Test 3 - HashSet: " + findDuplicateHashSet(test3)); // Output: 5
    }
}
