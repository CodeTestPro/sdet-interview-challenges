package challenges.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * Problem: Two Sum
 * Given an array of integers and a target sum, find two numbers that add up to the target.
 * Return the indices of the two numbers (not the numbers themselves).
 * 
 * Constraint: Each input has exactly one solution. You cannot use same element twice.
 * Example: Input: [2, 7, 11, 15], target = 9 => Output: [0, 1] (2 + 7 = 9)
 */
public class TwoSum {

    // Approach 1: Using HashMap (Most common - Best for interviews)
    // Time: O(n), Space: O(n)
    public static int[] twoSumHashMap(int[] nums, int target) {
        // Store number and its index in map for quick lookup
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Calculate complement we need to find
            int complement = target - nums[i];
            
            // Check if complement exists in our map
            if (numMap.containsKey(complement)) {
                // Return indices in order (complement index first)
                return new int[]{numMap.get(complement), i};
            }
            
            // Store current number with its index
            numMap.put(nums[i], i);
        }
        
        // No solution found (shouldn't happen per problem statement)
        return new int[]{};
    }

    // Approach 2: Two Pointer (Works only for sorted array)
    // Time: O(n log n) due to sorting, Space: O(1)
    public static int[] twoSumTwoPointer(int[] nums, int target) {
        // Create array with original indices
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }
        
        // Sort indices based on nums values
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[indices[left]] + nums[indices[right]];
            
            if (sum == target) {
                // Return original indices (smaller one first)
                return new int[]{Math.min(indices[left], indices[right]), Math.max(indices[left], indices[right])};
            } else if (sum < target) {
                // Need bigger sum, move left pointer right
                left++;
            } else {
                // Need smaller sum, move right pointer left
                right--;
            }
        }
        
        return new int[]{};
    }

    // Approach 3: Brute Force (Not recommended but shows simple logic)
    // Time: O(n^2), Space: O(1)
    public static int[] twoSumBruteForce(int[] nums, int target) {
        // Check every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Test cases
    public static void main(String[] args) {
        // Test case 1
        int[] test1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test 1 - HashMap: " + Arrays.toString(twoSumHashMap(test1, target1))); // [0, 1]
        System.out.println("Test 1 - Two Pointer: " + Arrays.toString(twoSumTwoPointer(test1, target1))); // [0, 1]
        
        // Test case 2
        int[] test2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Test 2 - HashMap: " + Arrays.toString(twoSumHashMap(test2, target2))); // [1, 2]
        
        // Test case 3 - Negative numbers
        int[] test3 = {-1, -2, -3, 5, 10};
        int target3 = 2;
        System.out.println("Test 3 - HashMap: " + Arrays.toString(twoSumHashMap(test3, target3))); // [2, 4]
    }
}
