public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode cur = temp;
        while (cur.next != null && cur.next.next != null) {
            ListNode pre = cur.next;
            ListNode mid = cur.next.next;
            ListNode las = cur.next.next.next;

            cur.next = mid;
            mid.next = pre;
            pre.next = las;

            cur = cur.next.next;
        }
        return temp.next;
    }

    public ListNode swapPairsRecu(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairsRecu(head.next.next);
        temp.next = head;
        return temp;
    }
}
