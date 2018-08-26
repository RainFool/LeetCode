public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] listNodes) {
        if (listNodes == null || listNodes.length == 0) {
            return null;
        }
        int n = listNodes.length;
        while (n > 1) {
            int k = (n + 1) / 2;
            for (int i = 0; i < n / 2; i++) {
                listNodes[i] = mergeTwoLists(listNodes[i], listNodes[i + k]);
            }
            n = k;
        }
        return listNodes[0];
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode listNode;
        ListNode itr = new ListNode(Integer.MIN_VALUE);
        listNode = itr;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                itr.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                itr.next = l1;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    itr.next = l1;
                    l1 = l1.next;
                } else {
                    itr.next = l2;
                    l2 = l2.next;
                }
            }
            itr = itr.next;
        }
        return listNode.next;
    }
}
