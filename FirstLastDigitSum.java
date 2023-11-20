/*
FirstLastDigitSum.java
Michael McCreary
20/11/2023
 */

/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.

The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class FirstLastDigitSum {
    public static void main(String[] args) {
        // Test the sumFirstAndLastDigit method with various numbers and print the result
        System.out.println(sumFirstAndLastDigit(252));   // Should print 4 (2 + 2)
        System.out.println(sumFirstAndLastDigit(227));   // Should print 9 (2 + 7)
        System.out.println(sumFirstAndLastDigit(0));     // Should print 0 (single digit)
        System.out.println(sumFirstAndLastDigit(5));     // Should print 10 (5 + 5)
        System.out.println(sumFirstAndLastDigit(-10));   // Should print -1 (invalid value)
    }

    // Method to find the sum of the first and last digit of a given number
    public static int sumFirstAndLastDigit(int number) {

        int firstDigit = 0;
        int lastDigit = number % 10; // Extract the last digit of the number

        // Check if the number is negative, return -1 for invalid value
        if (number < 0) {
            return -1;
        }

        // Find the first digit of the number
        while (number >= 10) {
            number = number / 10; // Remove the last digit
        }
        firstDigit = number;

        // Return the sum of the first and last digits
        return firstDigit + lastDigit;
    }
}