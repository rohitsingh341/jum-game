package main;

public class JumpGame {
    public static void main(String[] args) {
        int [] jumps = {2,1,2,1,2,0,2}; // End Reachable
        // int [] jumps = {2,1,2,1,1,1,2}; // End Reachable
        //int [] jumps = {2,1,2,1,1,0,2}; // End NOT Reachable

        //Greedy Approach

        if (isReachingToEnd(jumps)) {
            System.out.println("We can reach to the end...");
        }
        else {
            System.out.println("We cannot reach to the end...");
        }
    }

    private static boolean isReachingToEnd(int[] jumps) {
        int goal = jumps.length - 1;

        for (int i = jumps.length - 2; i >= 0; --i) {

            if (i + jumps[i] >= goal)
                goal = i;
        }
        return goal == 0;
    }
}
