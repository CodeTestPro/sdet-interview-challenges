package challenges.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * Problem: Count Frequency of Each Element
 * Given an array/list of integers, count the frequency of each element and return as Map.
 * Collections like HashMap are perfect for this.
 * 
 * Example: [1, 2, 2, 3, 3, 3] => {1=1, 2=2, 3=3}
 */
public class CountFrequency {

    // Approach 1: Using HashMap (Most straightforward)
    // Time: O(n), Space: O(k) where k = unique elements
    public static Map<Integer, Integer> countFrequencyHashMap(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Iterate through array and count occurrences
        for (int num : arr) {
            // getOrDefault helps handle first occurrence
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        return freqMap;
    }

    // Approach 2: Using Java Streams (Modern approach)
    // Time: O(n), Space: O(k)
    public static Map<Integer, Long> countFrequencyStream(int[] arr) {
        // Stream approach is clean and functional
        return java.util.Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.counting()
                ));
    }

    // Approach 3: Using LinkedHashMap to maintain insertion order
    // Time: O(n), Space: O(k)
    public static Map<Integer, Integer> countFrequencyLinkedHashMap(int[] arr) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // LinkedHashMap maintains insertion order
        return freqMap;
    }

    // Test cases
    public static void main(String[] args) {
        // Test case 1
        int[] test1 = {1, 2, 2, 3, 3, 3};
        System.out.println("Test 1 - HashMap: " + countFrequencyHashMap(test1));
        // Output: {1=1, 2=2, 3=3}
        
        // Test case 2
        int[] test2 = {5, 5, 5, 5};
        System.out.println("Test 2 - HashMap: " + countFrequencyHashMap(test2));
        // Output: {5=4}
        
        // Test case 3 - Using Stream approach
        int[] test3 = {1, 1, 2, 2, 2, 3};
        System.out.println("Test 3 - Stream: " + countFrequencyStream(test3));
        // Output: {1=2, 2=3, 3=1}
        
        // Test case 4 - LinkedHashMap maintains order
        int[] test4 = {3, 1, 2, 1, 3};
        System.out.println("Test 4 - LinkedHashMap: " + countFrequencyLinkedHashMap(test4));
        // Output: {3=2, 1=2, 2=1} (maintains insertion order)
    }
}
