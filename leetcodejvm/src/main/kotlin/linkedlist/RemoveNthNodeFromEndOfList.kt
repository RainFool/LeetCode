package linkedlist

import datastructure.ListNode

/*
 * Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
 */
class RemoveNthNodeFromEndOfList {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        val dum: ListNode? = ListNode(0)
        dum?.next = head

        var ptr1 = dum
        var ptr2 = dum
        repeat(n + 1) {
            ptr2 = ptr2?.next
        }

        while (ptr2 != null) {
            ptr1 = ptr1?.next
            ptr2 = ptr2?.next
        }

        ptr1?.next = ptr1?.next?.next

        return dum?.next
    }

}