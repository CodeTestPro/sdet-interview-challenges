package com.challenges.strings;

/**
 * Challenge: String s = "sub53od73th"; Eliminate the numbers alone. Print the Alphabets.
 * 
 * Example: "sub53od73th" -> "subodth"
 */
public class RemoveNumbers {

    /**
     * Removes all numeric digits from the string
     * @param str Input string with mixed characters and numbers
     * @return String with only alphabetic characters
     */
    public static String removeNumbers(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        return str.replaceAll("[0-9]", "");
    }

    public static void main(String[] args) {
        String input1 = "sub53od73th";
        String input2 = "abc123def456ghi";
        String input3 = "java2024programming";
        
        System.out.println("Input: " + input1 + " -> Output: " + removeNumbers(input1));
        System.out.println("Input: " + input2 + " -> Output: " + removeNumbers(input2));
        System.out.println("Input: " + input3 + " -> Output: " + removeNumbers(input3));
    }
}
