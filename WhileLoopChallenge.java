/*
WhileLoopChallenge.java
Michael Mccreary
19/11/2023
 */

/*
Create a method called isEvenNumber that takes a parameter type int.

Its purpose is to determine if the argument passed to the method is an even number or not.

return true from the method, if it's an even number, otherwise return false

next, use a while loop to test a range of numbers from 5 up to and including 20,
but printing out only the even numbers, determined by the call to the isEvenNumber Method

The code also needs to record the number of even numbers it has found.

Break out of the loop once it has found 5 even numbers.

finally display the total number of odd and even numbers found
 */

public class WhileLoopChallenge {
    public static void main(String[] args) {

        // Initialize variables for counting even and odd numbers
        int num = 4;
        int evenNumber = 0;
        int oddNumber = 0;

        // While loop to iterate from num to 20
        while (num <= 20) {
            num++; // Increment num in each iteration

            // Check if the current number is even using the isEvenNumber method
            if (isEvenNumber(num)) {
                evenNumber++; // Increment the count of even numbers
                System.out.println(num); // Print the even number

                // Break the loop if 5 even numbers have been found
                if (evenNumber == 5) {
                    break;
                }
            }
            // If the current number is not even, increment the count of odd numbers
            else if (!isEvenNumber(num)) {
                oddNumber++;
            }
        }

        // Print the counts of even and odd numbers
        System.out.println("The number of even numbers is " + evenNumber);
        System.out.println("The number of odd numbers is " + oddNumber);
    }

    // Method to check if a number is even
    public static boolean isEvenNumber(int number) {
        // Check if the number is divisible by 2
        if (number % 2 == 0) {
            return true; // Return true if the number is even
        } else {
            return false; // Return false if the number is not even
        }
    }
}
