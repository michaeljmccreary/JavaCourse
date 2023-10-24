/*
TraditionalSwitchChallenge.java
Michael McCreary
24/10/2023
 */

/*
In this challenge, we'll be using the NATO alphabet to replace a character or letter,
with NATOS's standardized word for that letter. for the letters A through E
 */
public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char charValue = 'O';
        switch(charValue){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
        }
    }
}
