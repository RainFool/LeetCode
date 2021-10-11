/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        if (k == 0) {
            return head;
        }
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur.next == null) {
                cur = head;
            } else {
                cur = cur.next;
            }
        }
        if (cur.next == null) {
            return head;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        ListNode temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }
}
// @lc code=end
