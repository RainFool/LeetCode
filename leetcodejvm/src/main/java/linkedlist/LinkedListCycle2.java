package linkedlist;

import base.ListNode;

/*
 * Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        boolean isHasCycle = false;
        ListNode fp = head;
        ListNode sp = head;

        while (sp.next != null && fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (sp == fp) {
                isHasCycle = true;
                break;
            }
        }
        if (!isHasCycle) {
            return null;
        }
        sp = head;
        while (sp != fp) {
            sp = sp.next;
            fp = fp.next;
        }
        return sp;
    }
}
