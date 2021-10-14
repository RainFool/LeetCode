/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return getCurSum(root, targetSum) + 
        pathSum(root.left, targetSum) +
        pathSum(root.right, targetSum);
    }

    private int getCurSum(TreeNode root, int target) {
        if (root == null) return 0;
        int cur = 0;
        if (root.val == target) ++cur;
        int left = getCurSum(root.left, target - root.val);
        int right = getCurSum(root.right, target - root.val);
        return cur + left + right;
    }
}
// @lc code=end

