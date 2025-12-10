package com.challenges.strings;

/**
 * Challenge: Change a string such that first character is upper case,
 * second is lower case and so on.
 * 
 * Example: "Hello" -> "HeLlO"
 */
public class AlternatingCaseChanger {

    /**
     * Converts string to alternating case pattern
     * @param str Input string
     * @return Converted string with alternating case
     */
    public static String alternatingCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                // Even index - uppercase
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Odd index - lowercase
                result.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "Hello";
        String input2 = "JavaProgramming";
        String input3 = "interview";
        
        System.out.println("Input: " + input1 + " -> Output: " + alternatingCase(input1));
        System.out.println("Input: " + input2 + " -> Output: " + alternatingCase(input2));
        System.out.println("Input: " + input3 + " -> Output: " + alternatingCase(input3));
    }
}
