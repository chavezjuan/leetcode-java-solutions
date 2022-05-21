package com.leetcode.test;

import com.leetcode.learn.array.PivotIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PivotIndexTest {
    PivotIndex pivotIndex = new PivotIndex();

    @Test
    void findPivotIndexWithSuccess(){
        int[] list = {1,7,3,6,5,6};
        int[] listTwo = {-1,-1,-1,-1,-1,-1};
        Assertions.assertEquals(3, pivotIndex.pivotIndex(list));
        Assertions.assertEquals(-1, pivotIndex.pivotIndex(listTwo));
    }

    @Test
    void notFindPivotIndexWithSuccess(){
        int[] list = {1,2,3};
        Assertions.assertEquals(-1, pivotIndex.pivotIndex(list));
    }

    @Test
    void findLeftEdgePivotIndexWithSuccess(){
        int[] list = {1,-3,3};
        Assertions.assertEquals(0, pivotIndex.pivotIndex(list));
    }

    @Test
    void findRightEdgePivotIndexWithSuccess(){
        int[] list = {4,-4,3};
        Assertions.assertEquals(2, pivotIndex.pivotIndex(list));
    }
}
