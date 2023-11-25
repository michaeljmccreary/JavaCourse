/*
FactorPrinter.java
Michael McCreary
25/11/2023
 */

/*
Write a method named printFactors with one parameter of type int named number.

If number is < 1, the method should print "Invalid Value".

The method should print all factors of the number.
A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
 */
public class FactorPrinter {

    public static void main(String[] args) {

        // Example usage of the printFactors method
        // This will print the factors of 6 and 32
        printFactors(6);
        printFactors(32);
    }

    // Method to print factors of a given number
    public static void printFactors(int number) {

        // Check if the given number is less than 1
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            // Use a loop to iterate from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Check if 'i' is a factor of the given number
                if (number % i == 0) {
                    // If 'i' is a factor, print it
                    System.out.println(i);
                }
            }
        }
    }
}
