package linkedlist;

import base.Node;

public class RemoveLinkedListElements {
    public Node removeElements(Node head, int val) {
        if (head == null) {
            return null;
        }
        Node dummy = new Node(1);
        dummy.next = head;

        Node cur = head;
        Node pre = dummy;
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
