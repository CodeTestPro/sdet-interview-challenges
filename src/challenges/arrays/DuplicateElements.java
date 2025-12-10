package com.challenges.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Challenge: Find duplicate elements in an array of numbers.
 * 
 * Example: {1, 2, 3, 2, 4, 3} -> [2, 3]
 */
public class DuplicateElements {

    /**
     * Finds all duplicate elements in an array
     * @param arr Input array
     * @return Array of duplicate elements
     */
    public static int[] findDuplicates(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[0];
        }
        
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 4, 3};
        int[] arr2 = {1, 1, 1, 2, 2, 3};
        int[] arr3 = {5, 10, 15, 10, 20};
        
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Duplicates: " + Arrays.toString(findDuplicates(arr1)));
        
        System.out.println("\nArray: " + Arrays.toString(arr2));
        System.out.println("Duplicates: " + Arrays.toString(findDuplicates(arr2)));
        
        System.out.println("\nArray: " + Arrays.toString(arr3));
        System.out.println("Duplicates: " + Arrays.toString(findDuplicates(arr3)));
    }
}
