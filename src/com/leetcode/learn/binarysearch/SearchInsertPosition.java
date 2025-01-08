package com.leetcode.learn.binarysearch;

/*
* https://leetcode.com/problems/search-insert-position?envType=study-plan-v2&envId=top-100-liked
* */
public class SearchInsertPosition {
//    public int searchInsert(int[] nums, int target) {
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] == target || target < nums[index]) {
//                return index;
//            }
//        }
//        return nums.length;
//    }
    /*Using binary search algorithm*/
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[mid] == target) {
                return  mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return left;
    }
}
