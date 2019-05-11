import base.ListNode;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListTest {

    private int[] values1;
    private int[] values2;
    private ListNode listNode1;
    private ListNode listNode2;

    @Before
    public void setUp() throws Exception {
        values1 = new int[]{1, 2, 4};
        values2 = new int[]{1, 3, 5, 6};

        listNode1 = ListNodeHelper.buildListNode(values1);
        listNode2 = ListNodeHelper.buildListNode(values2);
    }

    @Test
    public void testMergeTwoLists() throws Exception {
        long start = System.currentTimeMillis();
        ListNode result = new MergeTwoSortedList().mergeTwoLists(listNode1, listNode2);
        long end = System.currentTimeMillis();
        String printData = ListNodeHelper.generateListNodeString(result);
        System.out.println(printData);
        System.out.println("merge takes time :" + (end - start));
    }

}