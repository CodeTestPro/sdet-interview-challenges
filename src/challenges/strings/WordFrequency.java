package com.challenges.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Challenge: To print the frequency of words in a paragraph.
 * 
 * Example: "hello world hello java" -> {hello=2, world=1, java=1}
 */
public class WordFrequency {

    /**
     * Calculates frequency of each word in a paragraph
     * @param paragraph Input paragraph
     * @return Map containing words and their frequencies
     */
    public static Map<String, Integer> getWordFrequency(String paragraph) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return frequencyMap;
        }
        
        // Convert to lowercase and split by spaces
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
        
        // Count frequency of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        
        return frequencyMap;
    }

    public static void main(String[] args) {
        String paragraph1 = "hello world hello java hello programming";
        String paragraph2 = "java is great java is powerful";
        
        System.out.println("Paragraph: \"" + paragraph1 + "\"");
        System.out.println("Word Frequency: " + getWordFrequency(paragraph1));
        
        System.out.println("\nParagraph: \"" + paragraph2 + "\"");
        System.out.println("Word Frequency: " + getWordFrequency(paragraph2));
    }
}
