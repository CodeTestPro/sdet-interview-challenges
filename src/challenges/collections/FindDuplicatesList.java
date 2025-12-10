package com.challenges.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Challenge: Find duplicates between two lists.
 */
public class FindDuplicatesList {

    /**
     * Finds common elements (duplicates) between two lists
     * @param list1 First list
     * @param list2 Second list
     * @return List of duplicate elements
     */
    public static List<Integer> findDuplicates(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()) {
            return new ArrayList<>();
        }
        
        Set<Integer> set1 = new HashSet<>(list1);
        List<Integer> duplicates = new ArrayList<>();
        
        for (Integer num : list2) {
            if (set1.contains(num) && !duplicates.contains(num)) {
                duplicates.add(num);
            }
        }
        
        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Duplicates: " + findDuplicates(list1, list2));
    }
}
