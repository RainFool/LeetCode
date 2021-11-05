/*
 * @lc app=leetcode.cn id=109 lang=java
 *
 * [109] 有序链表转换二叉搜索树
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return sort(head,null);
    }

    private TreeNode sort(ListNode start,ListNode end) {
        if (start == end) {
            return null;
        }
        ListNode mid = getMid(start,end);
        TreeNode root = new TreeNode(mid.val);
        root.left = sort(start, mid);
        root.right = sort(mid.next,end);
        return root;
    }

    private ListNode getMid(ListNode start,ListNode right) {
        ListNode fast = start;
        ListNode slow = start;
        while (fast != right && fast.next != right ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
// @lc code=end

