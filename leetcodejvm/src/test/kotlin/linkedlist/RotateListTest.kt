package linkedlist

import org.junit.Test

class RotateListTest {

    val l1 = intListToLinkedList(listOf(1))
    val l2 = intListToLinkedList(listOf())
    val l3 = intListToLinkedList(listOf(1, 2))
    val l4 = intListToLinkedList(listOf(5, 4, 3, 2, 1))
    val l5 = intListToLinkedList(listOf(1, 2, 3, 4, 5))
    @Test
    fun rotateRight() {
//        RotateList().rotateRight(l1, 0)?.print()
//        RotateList().rotateRight(l2, 0)?.print()
//        RotateList().rotateRight(l3, 1)?.print()
//        RotateList().rotateRight(l4, 2)?.print()
        RotateList().rotateRight(l5, 2)?.print()
    }
}