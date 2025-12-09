package challenges.strings;

/**
 * String Reversal - Learn Different Ways to Reverse a String
 * This challenge demonstrates various approaches to reverse strings
 * commonly asked in interviews.
 */
public class ReverseString {

    // Method 1: Using StringBuilder (Most Common)
    // Simple and efficient approach
    public static String reverseUsingStringBuilder(String str) {
        // StringBuilder has a built-in reverse method
        return new StringBuilder(str).reverse().toString();
    }

    // Method 2: Using a Loop
    // Shows basic iteration and character handling
    public static String reverseUsingLoop(String str) {
        String reversed = "";
        
        // Start from the end and move backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        return reversed;
    }

    // Method 3: Using Character Array
    // More efficient than concatenation
    public static String reverseUsingArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        // Swap characters from both ends moving towards center
        while (left < right) {
            // Swap left and right characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(chars);
    }

    // Method 4: Using Recursion
    // Shows recursive thinking
    public static String reverseUsingRecursion(String str) {
        // Base case: if string is empty or single character, return as is
        if (str.length() <= 1) {
            return str;
        }
        
        // Recursive case: take last character and add reversed rest
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    // Method 5: Using Streams (Java 8+)
    // Modern functional approach
    public static String reverseUsingStream(String str) {
        // Convert to stream of characters, reverse, and collect back
        return str.chars()
                .boxed()
                .map(c -> (char) c.intValue())
                .reduce("", 
                    (acc, c) -> c + acc,
                    (s1, s2) -> s1 + s2
                );
    }

    // Test cases
    public static void main(String[] args) {
        // Test strings
        String test1 = "Hello";
        String test2 = "Java";
        String test3 = "A";
        String test4 = "";

        System.out.println("=== Reversing Strings ===");
        System.out.println();
        
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("  Using StringBuilder: " + reverseUsingStringBuilder(test1));
        System.out.println("  Using Loop: " + reverseUsingLoop(test1));
        System.out.println("  Using Array: " + reverseUsingArray(test1));
        System.out.println("  Using Recursion: " + reverseUsingRecursion(test1));
        System.out.println();
        
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("  Using StringBuilder: " + reverseUsingStringBuilder(test2));
        System.out.println();
        
        System.out.println("Test 3: \"" + test3 + "\" (Single character)");
        System.out.println("  Result: " + reverseUsingStringBuilder(test3));
        System.out.println();
        
        System.out.println("Test 4: \"" + test4 + "\" (Empty string)");
        System.out.println("  Result: \"" + reverseUsingStringBuilder(test4) + "\"");
    }
}
