package challenges.strings;

/**
 * Palindrome Checker - Check if a String is a Palindrome
 * A palindrome reads the same forwards and backwards
 * Example: "racecar" is a palindrome
 */
public class PalindromeChecker {

    // Method 1: Using String Comparison
    // Simple approach - reverse and compare
    public static boolean isPalindromeSimple(String str) {
        // Remove spaces and convert to lowercase for comparison
        String cleaned = str.replaceAll(" ", "").toLowerCase();
        
        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();
        
        // Check if original equals reversed
        return cleaned.equals(reversed);
    }

    // Method 2: Using Two Pointers
    // Efficient approach - compare from both ends
    public static boolean isPalindromeTwoPointer(String str) {
        // Clean the string
        String cleaned = str.replaceAll(" ", "").toLowerCase();
        
        // Compare characters from start and end
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            // If characters don't match, not a palindrome
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    // Method 3: Ignoring Special Characters
    // Real-world approach
    public static boolean isPalindromeIgnoreSpecial(String str) {
        // Keep only alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Use two pointer approach
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println("=== Palindrome Checker ===");
        System.out.println();
        
        // Test case 1: Simple palindrome
        String test1 = "racecar";
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("  Is Palindrome: " + isPalindromeSimple(test1)); // true
        System.out.println();
        
        // Test case 2: Not a palindrome
        String test2 = "hello";
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("  Is Palindrome: " + isPalindromeSimple(test2)); // false
        System.out.println();
        
        // Test case 3: With spaces
        String test3 = "race car";
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("  Is Palindrome (ignoring spaces): " + isPalindromeTwoPointer(test3)); // true
        System.out.println();
        
        // Test case 4: With special characters
        String test4 = "A man, a plan, a canal: Panama";
        System.out.println("Test 4: \"" + test4 + "\"");
        System.out.println("  Is Palindrome (ignoring special): " + isPalindromeIgnoreSpecial(test4)); // true
        System.out.println();
        
        // Test case 5: Single character
        String test5 = "a";
        System.out.println("Test 5: \"" + test5 + "\" (Single character)");
        System.out.println("  Is Palindrome: " + isPalindromeSimple(test5)); // true
    }
}
