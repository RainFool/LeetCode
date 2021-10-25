/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if(root.left == null && root.right == null) {
            return -1;
        }
        int l = root.left.val;
        int r = root.right.val;
        if(l == root.val) {
            l =  findSecondMinimumValue(root.left);
        } 
        if (r == root.val) {
            r =  findSecondMinimumValue(root.right);
        }
        if (l != -1 && r != -1) return Math.min(l, r);
        if (l != -1) return l;
        return r;
    }
}
// @lc code=end

