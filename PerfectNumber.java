/*
PerfectNumber.java
Michael McCreary
25/11/2023
 */

/*
What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, take the number 6:
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.

Therefore, 6 is a perfect number (as well as the first perfect number).



Write a method named isPerfectNumber with one parameter of type int named number.

If number is < 1, the method should return false.

The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        // Example usage of the isPerfectNumber method
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        // Variable to store the sum of divisors
        int sum = 0;

        // Check if the given number is less than 1
        if (number < 1) {
            // If so, return false as negative numbers are not perfect
            return false;
        } else {
            // Use a loop to iterate through potential divisors (up to number - 1)
            for (int i = 1; i < number; i++) {
                // Check if 'i' is a divisor of the given number
                if (number % i == 0) {
                    // If 'i' is a divisor, add it to the sum of divisors
                    sum += i;
                }
                // Check if the sum of divisors equals the original number
                if (number == sum) {
                    // If so, return true as the number is a perfect number
                    return true;
                }
            }
        }

        // If the loop completes and no perfect number is found, return false
        return false;
    }
}
