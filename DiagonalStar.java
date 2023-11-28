/*
DiagonalStar.java
Michael McCreary
28/11/2023
 */

/*
Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops
 */

public class DiagonalStar {
    public static void main(String[] args) {

        printSquareStar(90);
    }
    public static void printSquareStar(int number){

        // Check if the provided number is less than 5
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Loop through rows
        for (int row = 1; row <= number; row++) {
            // Loop through columns
            for (int col = 1; col <= number; col++) {
                // Print stars for the first row, last row, first column, last column,
                // and diagonals
                if (row == 1 || row == number || col == 1 || col == number || row == col || col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    // Print space for non-diagonal positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
