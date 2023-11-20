/*
DigitSumChallenge.java
Michael McCreary
20/11/2023
 */

/*
In this challenge, the task is to write a method, with the name sumDigits that has a single parameter type int,
that should return an int.

The method should only take a positive number and return -1 if a negative number is passed to it.

the method should parse out each digit from the number and sum the digits up.

so if 125 is passed to the method, the code should sum each digit, in this case 1 + 2 + 5 and return 8 as the value.

if the number is a single digit, simple return the number its self.
 */
public class DigitSumChallenge {
    public static void main(String[] args) {

        // Display the sum of digits for various numbers
        System.out.println("The sum of the digits in 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in 32123 is " + sumDigits(32123));
    }

    // Method to calculate the sum of digits in a given number
    public static int sumDigits(int number) {
        // Check if the number is negative, if so, return -1 (invalid input)
        if (number < 0) {
            return -1;
        }

        // Initialize the variable to store the sum of digits
        int sum = 0;

        // Loop until the number becomes a single-digit
        while (number > 9) {
            // Add the last digit (remainder when divided by 10) to the sum
            sum += (number % 10);
            // Remove the last digit from the number
            number = number / 10;
        }

        // Add the last remaining digit (or the only digit if it's a single-digit number)
        sum += number;

        // Return the calculated sum of digits
        return sum;
    }
}
