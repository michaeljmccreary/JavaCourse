import java.util.Scanner;

/*
ReadingUserInput.java
Michael McCreary
25/11/2023
 */

public class ReadingUserInput {
    public static void main(String[] args) {
        // Set the current year
        int currentYear = 2023;

        try {
            // Try to get input from console, if System.console() is available
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            // If System.console() is not available, get input from Scanner
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    // Method to get user input using System.console()
    public static String getInputFromConsole(int currentYear) {
        // Prompt the user for their name
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course");

        // Prompt the user for their year of birth
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        // Return a message with the calculated age
        return "So you are " + age + " years old";
    }

    // Method to get user input using Scanner
    public static String getInputFromScanner(int currentYear) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Hi, What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks for taking the course");

        // Prompt the user for their year of birth with validation
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " +
                    (currentYear));
            try {
                // Use the checkData method to validate the input
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed! try again");
            }
        } while (!validDOB);

        // Return a message with the calculated age
        return "So you are " + age + " years old";
    }

    // Method to check if the entered year of birth is within a valid range
    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        // Check if the year of birth is within the valid range
        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1; // Return -1 for invalid data
        }

        // Return the calculated age
        return (currentYear - dob);
    }
}