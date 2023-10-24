/*
SwitchExpressionChallenge.java
Michael McCreary
24/10/2023
 */

/*
Craete a method called printDayWeek that takes an int parameter called day, but doesn't return any values.
use the enhanced switch statement to return the name of the day based on the parameter passed to the switch statement.
So that 0 will return "Sunday", 1 will return "Monday" and so on. Any number not between 0 and 6 should return "Invalid Day".

BONUS - Create a second method called printWeekday that uses an if then else statement instead of a switch to prodice the same output
 */

public class SwitchExpressionChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }

   public static void printDayOfWeek(int day){

        String dayOfWeek = switch (day){
            case 0 -> { yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
       System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day){

        String dayOfWeek = "Invalid day";
        if(day == 0){
            dayOfWeek = "Sunday";
        } else if (day ==1){
            dayOfWeek = "Monday";
        } else if(day ==2){
            dayOfWeek = "Tuesday";
        } else if(day == 3){
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if(day ==5){
            dayOfWeek = "Friday";
        } else if (day == 6){
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}