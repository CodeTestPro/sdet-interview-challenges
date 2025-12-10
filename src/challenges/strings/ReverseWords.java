package com.challenges.strings;

/**
 * Challenge: Reverse the words in the sentence.
 * 
 * Example: "Hello World Java" -> "Java World Hello"
 */
public class ReverseWords {

    /**
     * Reverses the order of words in a sentence
     * @param sentence Input sentence
     * @return Sentence with reversed word order
     */
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }
        
        String[] words = sentence.trim().split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "Hello World Java";
        String input2 = "Java programming is fun";
        String input3 = "SDET Interview Challenges";
        
        System.out.println("Input: \"" + input1 + "\" -> Output: \"" + reverseWords(input1) + "\"");
        System.out.println("Input: \"" + input2 + "\" -> Output: \"" + reverseWords(input2) + "\"");
        System.out.println("Input: \"" + input3 + "\" -> Output: \"" + reverseWords(input3) + "\"");
    }
}
