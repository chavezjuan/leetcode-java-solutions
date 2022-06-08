package com.leetcode.test;

import com.leetcode.learn.array.AtLeastTwice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtLeastTwiceTest {
    AtLeastTwice atLeastTwice = new AtLeastTwice();

    @Test
    void findDominantIndexWithSuccess(){
        int[] listOne = {3,6,1,0};
        int[] listTwo = {2};
        int[] listThree = {2,5};
        int[] listFour = {2,1,4};
        assertAll("find dominant number successfully",
                () -> assertEquals(1, atLeastTwice.dominantIndex(listOne),"listOne"),
                () -> assertEquals(0, atLeastTwice.dominantIndex(listTwo),"listTwo"),
                () -> assertEquals(1, atLeastTwice.dominantIndex(listThree),"listThree"),
                () -> assertEquals(2, atLeastTwice.dominantIndex(listFour),"listFour")
        );
    }

    @Test
    void notFindDominantIndexWithSuccess(){
        int[] listOne = {1,2,3,4};
        assertAll("not exists a unique dominant number",
                () -> assertEquals(-1, atLeastTwice.dominantIndex(listOne), "listOne"));
    }
}
