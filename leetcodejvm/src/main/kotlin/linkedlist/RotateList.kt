package linkedlist

import datastructure.ListNode

class RotateList {

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null) return null

        var len = 1
        var tail = head

        while (tail?.next != null) {
            tail = tail.next
            len++
        }

        tail?.next = head//circle the list

        val rotateNum = k % len
        if (rotateNum > 0) {

            (0 until len - rotateNum).forEach {
                tail = tail?.next
            }
        }

        val newHead = tail?.next
        tail?.next = null
        return newHead

    }
}