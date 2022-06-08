package com.leetcode.test;

import com.leetcode.learn.array.DiagonalTraverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiagonalTraverseTest {
    DiagonalTraverse diagonalTraverse = new DiagonalTraverse();

    @Test
    void printElementsDiagonalOrderWithSuccess(){

        int[][] matrixOne = {{1,2,3},{4,5,6},{7,8,9}};
        int[] matrixOneDiagonal = {1,2,4,7,5,3,6,8,9};
        int[][] matrixTwo = {{1,2},{3,4}};
        int[] matrixTwoDiagonal = {1,2,3,4};

        assertAll("print matrix elements in diagonal reading successfully",
                () -> assertArrayEquals(
                        matrixOneDiagonal,
                        diagonalTraverse.findDiagonalOrder(matrixOne),
                        "matrixOne"),
                () -> assertArrayEquals(
                        matrixTwoDiagonal,
                        diagonalTraverse.findDiagonalOrder(matrixTwo),
                        "matrixTwo")
        );
    }
}
