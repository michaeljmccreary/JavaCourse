/*
NumberPalindrome.java
Michael McCreary
20/11/2023
 */

/*
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.
 */
public class NumberPalindrome {
    public static void main(String[] args) {
        // Test the isPalindrome method with various numbers and print the result
        System.out.println(isPalindrome(121));    // Should print true
        System.out.println(isPalindrome(-222));   // Should print true
        System.out.println(isPalindrome(11212));  // Should print false
        System.out.println(isPalindrome(707));     // Should print true
    }

    // Method to check if a given number is a palindrome
    public static boolean isPalindrome(int number) {
        // Store the original number for later comparison
        int originalNumber = number;
        int lastDigit;
        int reverse = 0;

        // Reverse the digits of the number
        while (number != 0) {
            // Extract the last digit of the number
            lastDigit = number % 10;
            // Build the reversed number by multiplying the existing reversed number by 10 and adding the last digit
            reverse = reverse * 10 + lastDigit;
            // Remove the last digit from the original number
            number = number / 10;
        }

        // Check if the reversed number is equal to the original number
        if (reverse == originalNumber) {
            // If equal, the number is a palindrome
            return true;
        } else {
            // If not equal, the number is not a palindrome
            return false;
        }
    }
}
