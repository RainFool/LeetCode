package linkedlist

import datastructure.ListNode

fun intListToLinkedList(list: List<Int>): ListNode? {

    if (list.isEmpty()) {
        return null
    }
    val dummy = ListNode()
    var cur: ListNode? = dummy

    list.forEach {
        cur?.next = ListNode(it)
        cur = cur?.next
    }
    return dummy.next
}

fun ListNode.print() {
    val sb = buildPrintString()
    println(sb)
}

fun ListNode.buildPrintString(): String {
    val sb = StringBuilder()
    var cur: ListNode? = this
    do {
        sb.append(cur?.`val`)
        sb.append("->")
        cur = cur?.next
    } while (cur != null)
    sb.append("NULL")
    return sb.toString()
}
