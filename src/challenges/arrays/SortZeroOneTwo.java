package com.challenges.arrays;

import java.util.Arrays;

/**
 * Challenge: Sort a string which has only 0, 1, 2 in it.
 * 
 * Input: 010201010100222112
 * Output: 000000011111122222
 */
public class SortZeroOneTwo {

    /**
     * Sorts string containing only 0, 1, 2
     * @param str String with 0, 1, 2
     * @return Sorted string
     */
    public static String sort012String(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        char[] chars = str.toCharArray();
        int count0 = 0, count1 = 0, count2 = 0;
        
        // Count occurrences
        for (char c : chars) {
            if (c == '0') count0++;
            else if (c == '1') count1++;
            else if (c == '2') count2++;
        }
        
        // Reconstruct sorted string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count0; i++) result.append('0');
        for (int i = 0; i < count1; i++) result.append('1');
        for (int i = 0; i < count2; i++) result.append('2');
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "010201010100222112";
        String input2 = "210120210";
        String input3 = "111000222";
        
        System.out.println("Input: " + input1 + " -> Output: " + sort012String(input1));
        System.out.println("Input: " + input2 + " -> Output: " + sort012String(input2));
        System.out.println("Input: " + input3 + " -> Output: " + sort012String(input3));
    }
}
