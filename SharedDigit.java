/*
 SharedDigit.java
 Michael McCreary
 21/11/2023
 */

/*
Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false. 
*/
public class SharedDigit{
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 99));

    }
    public static boolean hasSharedDigit(int num1, int num2) {

        // Check if numbers are within the specified range [10, 99]
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int num1Digit1 = num1 / 10;  // Tens place of num1
        int num1Digit2 = num1 % 10;  // Ones place of num1
        int num2Digit1 = num2 / 10;  // Tens place of num2
        int num2Digit2 = num2 % 10;  // Ones place of num2

        // Check for shared digits
        if ((num1Digit1 == num2Digit1) || (num1Digit2 == num2Digit2) || (num1Digit2 == num2Digit1) || (num1Digit1 == num2Digit2)) {
            return true;
        } else {
            return false;
        }
    }
}