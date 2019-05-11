package array

import base.ListNode

class MergeTwoSortedListKT {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) {
            return null
        }
        if (l1 == null) {
            return l2
        }
        if (l2 == null) {
            return l1
        }
        return mergeTwoListsInner(l1, l2);
    }

    private fun mergeTwoListsInner(listNode1: ListNode, listNode2: ListNode): ListNode {
        var itr = ListNode(Int.MIN_VALUE)
        val listNode = itr



        var l1: ListNode? = listNode1
        var l2: ListNode? = listNode2

        while (true) {
            if (l1 == null && l2 == null) {
                break
            }
            if (l1 == null && l2 != null) {
                itr.next = l2
                l2 = l2.next
            } else if (l1 != null && l2 == null) {
                itr.next = l1
                l1 = l1.next
            } else {
                if (l1!!.`val` < l2!!.`val`) {
                    itr.next = l1
                    l1 = l1.next
                } else {
                    itr.next = l2
                    l2 = l2.next
                }
            }
            itr = itr.next
        }
        return listNode.next
    }

}