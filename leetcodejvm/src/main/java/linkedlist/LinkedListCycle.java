package linkedlist;

import base.Node;

/*
 * Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */
public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node fp = head;
        Node sp = head;

        while (sp.next != null && fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (sp == fp) {
                return true;
            }
        }
        return false;

    }
}
