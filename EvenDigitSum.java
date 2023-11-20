/*
EvenDigitSum.java
Michael McCreary
20/11/2023
 */

/*
Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class EvenDigitSum {
    public static void main(String[] args) {
        // Test the getEvenDigitSum method with various numbers and print the result
        System.out.println(getEvenDigitSum(123456789));  // Should print 20 (2 + 4 + 6 + 8)
        System.out.println(getEvenDigitSum(252));         // Should print 4 (2 + 2)
        System.out.println(getEvenDigitSum(-22));         // Should print -1 (invalid value)
    }

    // Method to calculate the sum of even digits within a given number
    public static int getEvenDigitSum(int number) {

        int sum = 0;

        // Check if the number is negative, return -1 for invalid value
        if (number < 0) {
            return -1;
        }

        while (number != 0) {
            int digit = number % 10; // Extract the last digit of the number

            // Check if the digit is even, and if so, add it to the sum
            if (digit % 2 == 0) {
                sum += digit;
            }

            number = number / 10; // Remove the last digit
        }

        return sum;
    }
}
