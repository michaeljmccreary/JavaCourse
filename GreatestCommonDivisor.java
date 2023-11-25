/*
GreatestCommonDivisor.Java
Michael McCreary
25/11/2023
 */

/*
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Example usage of the getGreatestCommonDivisor method
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    // Method to calculate the greatest common divisor (GCD) of two numbers
    public static int getGreatestCommonDivisor(int first, int second) {
        // Variable to store the common divisor
        int commonNumber = 0;

        // Check if either number is less than 10
        if (first < 10 || second < 10) {
            // If so, return -1 as the numbers are not valid for this operation
            return -1;
        } else {
            // Use a loop to find the common divisor
            for (int i = 1; i <= first && i <= second; i++) {
                // Check if 'i' is a common divisor of both numbers
                if ((first % i == 0) && (second % i == 0)) {
                    // If 'i' is a common divisor, update the commonNumber variable
                    commonNumber = i;
                }
            }
        }

        // Return the common divisor
        return commonNumber;
    }
}

