package com.leetcode.learn.binarytree;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreeInorderTraversal {
    List<Integer> inorderList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            inorderList.add(root.val);
            inorderTraversal(root.right);
        }
        return inorderList;
    }
}
