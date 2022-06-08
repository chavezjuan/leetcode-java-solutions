package com.leetcode.test;

import com.leetcode.learn.array.PlusOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    void findDominantIndexWithSuccess(){
        int[] listOne = {1,2,3};
        int[] listOnePlus = {1,2,4};
        int[] listTwo = {4,3,2,1};
        int[] listTwoPlus = {4,3,2,2};
        int[] listThree = {9};
        int[] listThreePlus = {1,0};
        int[] listFour = {9,9,9,9};
        int[] listFourPlus = {1,0,0,0,0};
        assertAll("number plus by one operation successfully",
                () -> assertArrayEquals(listOnePlus,plusOne.plusOne(listOne),"listOne"),
                () -> assertArrayEquals(listTwoPlus,plusOne.plusOne(listTwo),"listTwo"),
                () -> assertArrayEquals(listThreePlus,plusOne.plusOne(listThree),"listThree"),
                () -> assertArrayEquals(listFourPlus,plusOne.plusOne(listFour),"listFour")
        );
    }
}
