/*
ThePrimeNumberChallenge.java
Michael McCreary
19/11/2023
 */
public class PrimeNumberChallenge {
    public static void main(String[] args) {

//        This loop is used to determine what numbers between 2 & 20 are prime numbers by passing them to the isPrime method.
//        if a number is a prime number the primeNumber variable is incremented by 1
        int primeNumber = 0;
        for(int i = 2; i <= 100; i++){
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                primeNumber++;
            }
            // Once we have reached 3 prime numbers in the loop. the loop will break
            if(primeNumber == 3){
                break;
            }
        }

//         Prints out the number of prime numbers in the loop
        System.out.println("The total numbers of prime numbers is " + primeNumber);
    }

//     This method is used to determine if a number is a prime number
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return(wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;

    }
}
