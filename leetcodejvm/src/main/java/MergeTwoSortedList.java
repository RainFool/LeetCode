public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null &&l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        ListNode listNode;
        ListNode itr = new ListNode(Integer.MIN_VALUE);
        listNode = itr;

        while (true) {
            if (l1 == null && l2 == null) {
                break;
            }
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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
