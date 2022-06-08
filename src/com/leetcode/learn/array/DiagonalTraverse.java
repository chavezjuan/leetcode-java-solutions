package com.leetcode.learn.array;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int line = 0;
        int column = 0;
        boolean isUp = true;

        List<Integer> diagonalElements = new ArrayList<>();
        diagonalElements.add(mat[0][0]);

        for (int i = 0; i <= mat.length * mat[0].length; i++) {
            if (isUp) {
                column = column == mat.length ? column : column + 1;
                line = line == 0 ? line : line - 1;
            } else {
                while (column == 0) {
                    line++;
                    column--;




                }
            }
        }


    }
}
