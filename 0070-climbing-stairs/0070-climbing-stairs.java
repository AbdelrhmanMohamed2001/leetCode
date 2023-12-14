/*
Recursion:
--> is a function calls itself
--> used in problems that can be broken into smaller and repetitive problems
--> takes large space in memory, but iteration takes low space
--> make code readable, but iteration is complex

*/
class Solution {
     public static int climbStairsHelper(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1; // Base cases
        }

        if (memo[n] != 0) {
            return memo[n]; // If the value is already calculated, return it from the memo
        }

        // Calculate and store the value in the memo
        memo[n] = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);

        return memo[n];
    }

    public static int climbStairs(int n) {
        if (n < 0 || n > 45) {
            return 0;
        }


        int[] memo = new int[n + 1];
        return climbStairsHelper(n, memo);
    }
 
}