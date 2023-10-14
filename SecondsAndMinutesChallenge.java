/*
SecondsAndMinutesChallenge.java
Michael McCreary
14/10/2023
*/
public class SecondsAndMinutesChallenge{
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); // This is the first test case
        System.out.println(getDurationString(-65, 45)); // this is the 2nd test case
        System.out.println(getDurationString(65, 145)); // this is the 3rd test case
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "Invalid data for seconds(" + seconds + "), must be a positive intteger value";
        }

        int minutes = seconds / 60;
        return getDurationString( seconds / 60, seconds % 60);

    }

    public static String getDurationString(int minutes, int seconds){

        if(minutes < 0){
            return "Invalid data for minutes(" + minutes + "), must be a positive intteger value";
        }

        if(seconds <= 0 || seconds >= 59){
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
