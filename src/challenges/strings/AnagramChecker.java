package com.challenges.strings;

import java.util.Arrays;

/**
 * Challenge: WAP for Anagram problem.
 * 
 * Example: "listen" and "silent" are anagrams
 */
public class AnagramChecker {

    /**
     * Checks if two strings are anagrams of each other
     * @param str1 First string
     * @param str2 Second string
     * @return true if strings are anagrams, false otherwise
     */
    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        
        // Remove spaces and convert to lowercase
        String s1 = str1.replaceAll(" ", "").toLowerCase();
        String s2 = str2.replaceAll(" ", "").toLowerCase();
        
        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Sort characters and compare
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";
        String str4 = "world";
        
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams: " + isAnagram(str1, str2));
        System.out.println("\"" + str3 + "\" and \"" + str4 + "\" are anagrams: " + isAnagram(str3, str4));
        System.out.println("\"" + "act" + "\" and \"" + "cat" + "\" are anagrams: " + isAnagram("act", "cat"));
    }
}
