package linkedlist

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class ReverseLinkedListTest {


    val l1 = intListToLinkedList(listOf(1))
    val l2 = intListToLinkedList(listOf())
    val l3 = intListToLinkedList(listOf(1,2,3,4,5))
    val l4 = intListToLinkedList(listOf(5,4,3,2,1))
    val l5 = intListToLinkedList(listOf(0,0,0,0))
//    val l6 = intListToLinkedList(listOf(1))

    val reverser = ReverseLinkedList()
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun reverse() {
        reverser.reverse(l1)?.print()
        reverser.reverse(l2)?.print()
        reverser.reverse(l3)?.print()
        reverser.reverse(l4)?.print()
        reverser.reverse(l5)?.print()
    }
}