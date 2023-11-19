public class Main {
    public static void main(String[] args) {

        /*
        This is the basic function of a for loop.
        It will run through the condition set in the () brackets.
        it goes from 1 to 5 increments of 1 each time as per the "counter++".
         */
        for(int counter =1; counter <=5; counter++){
            System.out.println(counter);
        }

        /*
        This for loop iterates over a range of interest rates from 2.0 to 5.0. Inside this loop,
        it calculates and prints the interest amount for an initial principal amount of 10,000 using the calculateInterest method.
         */
        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000, rate);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println("€10,000 at " + rate + "% interest = €" + interestAmount);
        }

        /*
        Bonus Challenge:
        write a new for statement to calculate the interest on 100.
        Use the interest rates between 7.5 and 10, increment by 0.25 each time.
         */
        for(double rate = 7.5; rate <= 10; rate+=.25){
            double interestAmount = calculateInterest(100, rate);
            System.out.println("€100 at " + rate + "% interest = €" + interestAmount);
        }

    }
    // he calculateInterest method takes an amount and an interest rate as parameters and returns the calculated interest amount.
    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate / 100));
    }
}
