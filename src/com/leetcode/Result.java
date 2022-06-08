package com.leetcode;

import com.leetcode.learn.array.PlusOne;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Result {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.stream(plusOne.plusOne(new int[] {1,2,3})).boxed().collect(Collectors.toList()));
    }
}
