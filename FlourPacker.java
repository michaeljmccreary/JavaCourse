/*
FlourPacker.java
Michael McCreary
25/11/2023
 */

/*
Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

The parameter bigCount represents the count of big flour bags (5 kilos each).

The parameter smallCount represents the count of small flour bags (1 kilo each).

The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

If any of the parameters are negative, return false.
 */

public class FlourPacker {
    public static void main(String[] args) {
        // Test cases to check the canPack method
        System.out.println(canPack(1, 0, 4));   // Should print false
        System.out.println(canPack(1, 0, 5));   // Should print true
        System.out.println(canPack(0, 5, 4));   // Should print true
        System.out.println(canPack(2, 2, 1));   // Should print false
        System.out.println(canPack(-3, 2, 12)); // Should print false
    }

    // Method to check if it's possible to pack flour bags to meet the goal
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Check if any of the input values is negative, and return false if so
        if (smallCount < 0 || bigCount < 0 || goal < 0) {
            return false;
        }

        // Calculate the maximum number of big bags needed to meet the goal
        int maxBigBag = goal / 5;

        // Limit the number of big bags to the actual available quantity
        if (maxBigBag > bigCount) {
            maxBigBag = bigCount;
        }

        // Calculate the remaining goal after using the big bags
        int goalRemaining = goal - (maxBigBag * 5);

        // Check if there are enough small bags to fulfill the remaining goal
        if (smallCount >= goalRemaining) {
            return true;
        } else {
            return false;
        }
    }
}
