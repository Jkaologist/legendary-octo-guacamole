package com.jonk;

public class Solution {
    public static int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb(0, n, memo);
    }

    public static int climb(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[1] > 0) {
            return memo[i];
        }
        memo[i] = climb(i + 1, n, memo) + climb(i + 2, n, memo);
        return memo[i];
    }
}
