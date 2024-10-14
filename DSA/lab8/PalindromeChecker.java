public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        // Base case: If the string is empty or has one character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Check the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; // Not a palindrome
        }

        // Recursive case: check the substring without the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
