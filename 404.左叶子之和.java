/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    private int result;
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root,false);
        return result;
    }

    private void sum(TreeNode root, boolean isLeft) {
        if (root == null) return;
        if (root.left == null && root.right == null && isLeft) {
            result += root.val;
            return;
        }
        sum(root.left,true);
        sum(root.right,false);
        
    }
}
// @lc code=end

