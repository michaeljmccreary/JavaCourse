/*
LargestPrime.java
Michael McCreary
28/11/2023
 */

/*
Write a method named getLargestPrime with one parameter of type int named number.

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

The method should calculate the largest prime factor of a given number and return it.
 */

public class LargestPrime {
    public static void main(String[] args) {
        // Test cases to demonstrate the functionality of getLargestPrime method
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    // Method to find and return the largest prime factor of a given number
    public static int getLargestPrime(int number){
        // Variable to store the largest prime factor
        int prime = 0;

        // Check if the input number is less than or equal to 1
        if(number <= 1){
            // If yes, return -1 as there is no prime factor
            return -1;
        }

        // Loop through potential prime factors starting from 2
        for(int i = 2; i <= number; i++){
            // While the current factor is a divisor of the number
            while(number % i == 0){
                // Update the largest prime factor and reduce the number
                prime = i;
                number /= i;
            }
        }

        // Return the largest prime factor found
        return prime;
    }
}

