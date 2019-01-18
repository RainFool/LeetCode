package linkedlist

import datastructure.ListNode

class ReverseNodesKGroup {

    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {

        var dum = ListNode(0)
        dum.next = head

        var prev: ListNode? = dum
        var cur: ListNode? = head

        var i = 0
        while (cur != null) {
            ++i
            if (i % k == 0) {
                val last = prev?.next
                cur = cur.next
                prev?.next = reverseOneGroup(prev?.next, cur)
                prev = last
            } else {
                cur = cur.next
            }
        }
        return dum.next
    }

    fun reverseOneGroup(start: ListNode?, end: ListNode?): ListNode? {
        var pre = end
        var cur = start
        var next = start?.next
        while (cur != end) {
            cur?.next = pre
            pre = cur
            cur = next
            next = cur?.next
        }
        return pre
    }
}