/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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

    private Map<TreeNode,Integer> f = new HashMap<>();
    private Map<TreeNode,Integer> g = new HashMap<>();

    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
    }
    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
        f.put(root,root.val + g.getOrDefault(root.left,0) + g.getOrDefault(root.right,0));
        int left = Math.max(f.getOrDefault(root.left,0),g.getOrDefault(root.left,0));
        int right = Math.max(f.getOrDefault(root.right,0),g.getOrDefault(root.right,0));
        g.put(root,left + right);
    }
}
// @lc code=end

