import base.Node;

public class SwapNodesInPairs {
    public Node swapPairs(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = new Node(-1);
        temp.next = head;
        Node cur = temp;
        while (cur.next != null && cur.next.next != null) {
            Node pre = cur.next;
            Node mid = cur.next.next;
            Node las = cur.next.next.next;

            cur.next = mid;
            mid.next = pre;
            pre.next = las;

            cur = cur.next.next;
        }
        return temp.next;
    }

    public Node swapPairsRecu(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head.next;
        head.next = swapPairsRecu(head.next.next);
        temp.next = head;
        return temp;
    }
}
