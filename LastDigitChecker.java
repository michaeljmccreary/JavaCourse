/*
LastDigitChecker.java
Michael McCreary
25/11/2023
 */

/*
Write a method named hasSameLastDigit with three parameters of type int.

Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
 */
public class LastDigitChecker {
    public static void main(String[] args) {

        // this is to test the hasSameLastDigitMethod
        System.out.println(hasSameLastDigit(41, 22 , 71)); // should return true because 41 & 71 have the same last digit
        System.out.println(hasSameLastDigit(23, 32, 42)); // should return true because 32 & 42 have the same last digit
        System.out.println(hasSameLastDigit(9, 99, 999)); // should return false because 9 is not in range

        // This is to test the isValid method
        System.out.println(isValid(10)); // should return true, 10 is in range
        System.out.println(isValid(468)); // should return true
        System.out.println(isValid(1051)); // should return false, 1051 is not in range
    }

    /*
    Write another method named isValid with one parameter of type int.
    The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
     */

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        // creating local variables to store the last digit
        int rightDigit1;
        int rightDigit2;
        int rightDigit3;

        // creating a parameter to return false if any of the numbers passed to the method are not in range
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }

        // this is getting the last digit of each number and saving them to the local variable
        rightDigit1 = num1 % 10;
        rightDigit2 = num2 % 10;
        rightDigit3 = num3 % 10;

        // testing to see if any of the last digits match up and if they do returning true. returning false if they don't
        if ((rightDigit1 == rightDigit2) || (rightDigit1 == rightDigit3) || (rightDigit2 == rightDigit3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number){

        // Writing a parameter to return false if the number is not in range, returning true if it is
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
