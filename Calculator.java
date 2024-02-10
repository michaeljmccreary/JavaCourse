import java.util.Scanner; // Import statement for Scanner

public class Calculator {
    // Method to read inputs and print sum and average
        public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in);

            int sum = 0;
            int count = 0;

            while (true) {
                boolean isAnInt = scanner.hasNextInt();

                if (isAnInt) {
                    int number = scanner.nextInt();
                    sum += number;
                    count++;
                } else {
                    // Break the loop if input is not an int
                    break;
                }

                scanner.nextLine(); // Handle end of line (enter key)
            }

            long average = count > 0 ? Math.round((double) sum / count) : 0; // Corrected rounding

            System.out.println("SUM = " + sum + " AVG = " + average);

            scanner.close();
        }
}
