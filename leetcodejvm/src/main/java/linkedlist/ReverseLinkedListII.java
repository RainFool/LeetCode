package linkedlist;

import base.Node;

public class ReverseLinkedListII {

    // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
    // dummy-> 1 -> 2 -> 3 -> 4 -> 5

    // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
    // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
    public Node reverseBetween(Node head, int m, int n) {
        if (n == 1 || m == n) {
            return head;
        }

        Node dump = new Node(-1);
        dump.next = head;

        Node pre = dump;

        for (int i = 0; i < m-1; i++) {
            pre = pre.next;
        }

        Node start = pre.next;
        Node then = start.next;

        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return dump.next;
    }
}
