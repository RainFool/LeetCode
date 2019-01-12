package linkedlist

import datastructure.ListNode

class ReverseLinkedList {
    fun reverse(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        var prev: ListNode? = null
        var cur: ListNode? = head
        var next: ListNode? = null
        while (cur != null) {
            next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        }
        return prev
    }
}