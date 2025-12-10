package com.challenges.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Challenge: WAP to compare two HashMap for equality?
 * 
 * Example: Compare two HashMaps key-value pair
 */
public class CompareHashMaps {

    /**
     * Compares two HashMaps for equality
     * @param map1 First HashMap
     * @param map2 Second HashMap
     * @return true if both maps contain same key-value pairs
     */
    public static boolean compareMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Check if both maps are null
        if (map1 == null && map2 == null) {
            return true;
        }
        // Check if one is null
        if (map1 == null || map2 == null) {
            return false;
        }
        // Check if sizes are different
        if (map1.size() != map2.size()) {
            return false;
        }
        // Compare key-value pairs
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java", 5);
        map1.put("python", 3);
        map1.put("javascript", 7);
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java", 5);
        map2.put("python", 3);
        map2.put("javascript", 7);
        
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("java", 5);
        map3.put("python", 3);
        
        System.out.println("Map1 == Map2: " + compareMaps(map1, map2));
        System.out.println("Map1 == Map3: " + compareMaps(map1, map3));
        System.out.println("Map2 == Map3: " + compareMaps(map2, map3));
    }
}
