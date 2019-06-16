package linkedlist;

import base.Node;

public class ReverseLinkedList {
    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = new Node(0);

        dummy.next = head;
        Node cur = head;
        Node next = head.next;

        while (next != null) {
            cur.next = next.next;
            next.next = dummy.next;
            dummy.next = next;
            next = cur.next;
        }
        return dummy.next;
    }
}
