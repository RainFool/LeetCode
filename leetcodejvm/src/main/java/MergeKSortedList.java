import base.Node;

public class MergeKSortedList {
    public Node mergeKLists(Node[] nodes) {
        if (nodes == null || nodes.length == 0) {
            return null;
        }
        int n = nodes.length;
        while (n > 1) {
            int k = (n + 1) / 2;
            for (int i = 0; i < n / 2; i++) {
                nodes[i] = mergeTwoLists(nodes[i], nodes[i + k]);
            }
            n = k;
        }
        return nodes[0];
    }

    public Node mergeTwoLists(Node l1, Node l2) {

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        Node node;
        Node itr = new Node(Integer.MIN_VALUE);
        node = itr;

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
        return node.next;
    }
}
