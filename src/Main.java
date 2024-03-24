public class Main {
    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        // Compare the first and last characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If they are equal, check the substring between them recursively
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // If first and last characters are not equal, it's not a palindrome
            return false;
        }
    }

    public static void main(String[] args) {
        String testStr = "racecar";
        if (isPalindrome(testStr)) {
            System.out.println(testStr + " is a palindrome.");
        } else {
            System.out.println(testStr + " is not a palindrome.");
        }
    }
}
