package linkedlist

import datastructure.ListNode


class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        var fast = head
        var slow = head

        while (fast != null) {
            fast = fast.next
            if (slow?.`val` == fast?.`val`) {
                continue
            } else {
                slow?.next = fast
                slow = fast
            }
        }

        return head

    }
}