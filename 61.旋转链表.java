/*
 * @lc app=leetcode.cn id=61 lang=java
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
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
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        int n = 1;
        while (cur.next != null) {
            cur = cur.next;
            n++;
        }
        int newHeadIndex = n - k % n;
        if (newHeadIndex == n) {
            return head;
        }
        cur.next = head;
        while (newHeadIndex > 0) {
            cur = cur.next;
            newHeadIndex--;
        }
        ListNode ans = cur.next;
        cur.next = null;
        return ans;
    }
}
// @lc code=end
