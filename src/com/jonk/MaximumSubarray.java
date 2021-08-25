package com.jonk;

// Brute force O(N^2) solution
public class MaximumSubarray {
    public static int maxSubarray(int[] nums) {
        int maxContiguous = -100000;
        if (nums.length == 1) {
            return nums[0];
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                int val = nums[i];
                if (val > maxContiguous) {
                    maxContiguous = val;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    val += nums[j];
                    if (val > maxContiguous) {
                        maxContiguous = val;
                    }
                }
            }
        }
        return maxContiguous;
    }
}
