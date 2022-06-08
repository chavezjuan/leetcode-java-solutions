package com.leetcode.learn.array;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AtLeastTwice {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                List<Integer> currentList = Arrays.stream(nums).boxed().collect(Collectors.toList());
                Integer numberRef = currentList.get(i);
                currentList.remove(i);
                for (int j = 0; j < currentList.size(); j++) {
                    if (currentList.get(j)*2 > numberRef) {
                        break;
                    } else if (j == currentList.size() - 1) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
