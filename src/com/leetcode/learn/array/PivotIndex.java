package com.leetcode.learn.array;

/*
* leetcode: https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
* */
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int rightSum = 0;
            int leftSum = 0;

            if (i != nums.length - 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    rightSum += nums[j];
                    /*left sum*/
                    if (i != 0 && j == i + 1) {
                        for (int k = 0; k < i; k++) {
                            leftSum += nums[k];
                        }
                    }
                    if (leftSum == rightSum && j == nums.length - 1) {
                        return i;
                    }
                }
            } else {
                for (int k = 0; k < i; k++) {
                    leftSum += nums[k];
                }
                if (leftSum == rightSum) {
                    return i;
                }
            }
        }
        return -1;
    }
}