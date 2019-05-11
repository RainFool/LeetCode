package linkedlist;

import base.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(1);
        dummy.next = head;

        ListNode cur = head;
        ListNode pre = dummy;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                cur = cur.next;
                pre = pre.next;
            }
        }
        return dummy.next;
    }
}
