import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class RemoveDuplicatesFromSortedArrayTest {

    val dataList1 = listOf<Int>(0, 1, 2, 3)
    val dataList2 = listOf<Int>(0, 0, 1, 1, 2, 3)
    val dataList3 = listOf<Int>(0, 0, 0, 1, 1, 2, 3, 4, 4, 4, 4, 5)
    val dataList4 = emptyList<Int>()
    val dataList5 = listOf<Int>(0, 0, 0, 0, 0, 5)

    private lateinit var core: RemoveDuplicatesFromSortedArray

    @Before
    fun setUp() {
        core = RemoveDuplicatesFromSortedArray()
    }

    @Test
    fun testRemoveDuplicates() {
        assertEquals(4, core.removeDuplicates(dataList1.toIntArray()))
        assertEquals(4, core.removeDuplicates(dataList2.toIntArray()))
        assertEquals(6, core.removeDuplicates(dataList3.toIntArray()))
        assertEquals(0, core.removeDuplicates(dataList4.toIntArray()))
        assertEquals(2, core.removeDuplicates(dataList5.toIntArray()))
    }

}