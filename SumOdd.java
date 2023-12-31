/*
SumOdd.java
Michael McCreary
19/11/2023
 */

/*
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.
If number is odd return true, otherwise return false.
Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers in that range including the end and return the sum
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input.
 */
public class SumOdd {
    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number){

//      if a number is less than or equal zero returns false
        if(number <= 0){
            return false;
        }

//      Returns true if a number is odd, not dividable by 2.
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){

        int sum =0;

//        If start or end is less than or equal to zero it returns -1
//        If start is greater than end if returns -1
        if(start <= 0 || end <= 0 || start > end){
            return -1;
        }

//        this is the code that will run through the loop of the numbers entered into it
        for(int i = start; i <= end; i++){

//            this checks the isOdd method and if a number is Odd it will add it onto the next odd number until the loop ends
            if(isOdd(i)) {
                sum += i;
            }
        }

//        this returns the sum of all odd numbers in a loop
        return sum;
    }
}
