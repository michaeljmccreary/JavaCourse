/*
Michael McCreary
MinutesToYearsAndDaysCalculator.Java
21/10/2023
 */
/*
Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
 */
public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
      printYearsAndDays(525600);
      printYearsAndDays(1051200);
      printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
