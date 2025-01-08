package com.leetcode.test;

import com.leetcode.learn.binarysearch.SearchInsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @Test
    void shouldReturnZeroWhenArrayIsLengthOneAndTheTargetIsTheSameNumberWithSuccess() {
        var search = new SearchInsertPosition();
        int[] initialList = {2};

        assertEquals(0, search.searchInsert(initialList , 2), "index should be 0");
    }

    @Test
    void shouldReturnOneWhenArrayIsLengthOneAndTheTargetIsHigherWithSuccess() {
        var search = new SearchInsertPosition();
        int[] initialList = {2};

        assertEquals(1, search.searchInsert(initialList , 3), "The target is higher than the " +
                "current value. The index should be 1");
    }

    @Test
    void shouldReturnTargetIndexWhenTargetExistsWithSuccess() {
        var search = new SearchInsertPosition();
        int[] initialList = {2,5,8,9};

        assertEquals(3, search.searchInsert(initialList , 9), "The index should be 3");
    }

    @Test
    void shouldReturnTargetIndexWhenTargetNotExistsWithSuccess() {
        var search = new SearchInsertPosition();
        int[] initialList = {2,5,8,9};
        int[] initialListTwo = {1,3,5,6};

        assertAll("Target not included in array",
                () -> assertEquals(1, search.searchInsert(initialList , 4), "The index should be 1"),
                () -> assertEquals(4, search.searchInsert(initialListTwo , 7), "The index should be 4")
        );
    }
}