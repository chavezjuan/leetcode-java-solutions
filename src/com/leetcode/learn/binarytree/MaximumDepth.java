package com.leetcode.learn.binarytree;
/**
 * leetcode: https://leetcode.com/problems/maximum-depth-of-binary-tree?envType=study-plan-v2&envId=top-100-liked
 * <p>
 *     Given the root of a binary tree, return its maximum depth.<br/>
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * </p>
 * */
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}
