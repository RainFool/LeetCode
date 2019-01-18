package linkedlist

import org.junit.Test

class ReverseNodesKGroupTest {

    val l1 = intListToLinkedList(listOf(1))
    val l2 = intListToLinkedList(listOf())
    val l3 = intListToLinkedList(listOf(1, 2, 3, 4, 5))
    val l4 = intListToLinkedList(listOf(5, 4, 3, 2, 1))
    val l5 = intListToLinkedList(listOf(0, 0, 0, 1))
    @Test
    fun reverseKGroup() {
//        ReverseNodesKGroup().reverseKGroup(l1, 1)?.print()
//        ReverseNodesKGroup().reverseKGroup(l2, 1)?.print()
        ReverseNodesKGroup().reverseKGroup(l3, 2)?.print()
//        ReverseNodesKGroup().reverseKGroup(l4, 3)?.print()
//        ReverseNodesKGroup().reverseKGroup(l5, 3)?.print()
    }
}