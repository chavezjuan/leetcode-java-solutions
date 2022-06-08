package com.leetcode.learn.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9 && digits.length > 1) {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] == 9 && i == 0) {
                    digits[i] = 0;
                    int[] newOrder = {1};
                    int[] result = IntStream.concat(Arrays.stream(newOrder), Arrays.stream(digits)).toArray();
                    return result;
                } else if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }
        } else if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[] {1,0};
            } else {
                digits[0]++;
            }
        } else {
            digits[digits.length - 1]++;
        }
        return digits;
    }
}
