import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=513 lang=java
 *
 * [513] 找树左下角的值
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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        if (root == null) return 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            node = queue.poll();
            for (int i = 0;i < cnt;i++) {
                TreeNode node = queue.poll();
                if (i == 0) first = node.val;
                if (node.left != null) {
                    isBottom = false;

                    queue.add(node.left);
                }
                if (node.right != null) {
                    isBottom = false;
                    queue.add(node.right);

                }
            }
            if (isBottom) {
                return first;
            }
        }
        return 0;
    }
}
// @lc code=end

