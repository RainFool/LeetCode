package linkedlist

import datastructure.ListNode


class RemoveDuplicatesFromSortedList2 {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        var dummy: ListNode? = ListNode(Int.MIN_VALUE)
        dummy?.next = head
        var fast = head
        var mid = head
        var slow = dummy


        while (fast != null) {
            fast = fast.next
            if (mid?.`val` == fast?.`val`) {
                continue
            } else {
                if (mid?.next != fast) {
                    slow?.next = fast
                } else {
                    slow = slow?.next
                }
                mid = fast
            }
        }

        return dummy?.next

    }
}