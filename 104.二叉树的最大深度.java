import java.util.Stack;

import javax.swing.tree.TreeNode;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        int depth = 0;
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = stack.poll();
                if (cur.left != null)
                    stack.offer(cur.left);
                if (cur.right != null)
                    stack.offer(cur.right);
            }
            depth++;
        }
        return depth;
    }

}
// @lc code=end
