package sort;

public class MergeSort {


    public Node sort(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        Node dummy = new Node();
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node pendingSortRight = slow.next;
        slow.next = null;
        Node left = sort(dummy.next);
        Node right = sort(pendingSortRight);
        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        Node head = new Node();
        Node cur = head;
        while (left != null && right != null) {
            if (left.value < right.value) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        if (left == null) {
            cur.next = right;
        } else if (right == null) {
            cur.next = left;
        }
        return head.next;
    }

    public static class Node {

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public int value;
        public Node next;
    }
}
