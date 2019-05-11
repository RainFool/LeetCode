package linkedlist;

import base.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);

        dummy.next = head;
        ListNode cur = head;
        ListNode next = head.next;

        while (next != null) {
            cur.next = next.next;
            next.next = dummy.next;
            dummy.next = next;
            next = cur.next;
        }
        return dummy.next;
    }
}
