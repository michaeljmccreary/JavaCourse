/*
Sum3And5Challenge.java
michael McCreary
19/11/2023
 */

/*
Create a for loop using a range of numbers from 1 to 1000.
Sum all the numbers that can be divided by 3 and 5.
print out the numbers that have met the above conditions.
break the loop when you have found 5 numbers that met the conditions above.
after breaking out of the loop print the sum of the numbers that met the conditions above
 */

public class Sum3And5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int number = 0;
        int sumOfnumbers = 0;

//        loop to go through the numbers from 1 to 1000
        for(number = 1; number <=1000; number++){
            if(number % 3 == 0 && number % 5 == 0){
                count++; // if a number is dividable by 3 and 5, count increases by 1 each time.
                sumOfnumbers += number; // when it finds a number dividable by 3 and 5 it adds it on each time it finds a number.
                System.out.println(number + " = is dividable by 3 and 5");
            }

//            when it has found 5 numbers dividable by 3 and 5 it breaks the loop
            if(count == 5){
                break;
            }
        }

        System.out.println("The sum of sum numbers dividable by 3 and 5 is " + sumOfnumbers);
    }
}
