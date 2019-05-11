import base.ListNode;
import org.junit.Before;
import org.junit.Test;

public class SwapNodesInPairsTest {


    private int[] values;

    @Before
    public void setUp() throws Exception {

        values = new int[]{1, 3, 5, 6, 2};
    }

    @Test
    public void testSwapNodes() {
        ListNode listNode = ListNodeHelper.buildListNode(values);
        ListNode result = new SwapNodesInPairs().swapPairsRecu(listNode);
        System.out.println(ListNodeHelper.generateListNodeString(result));
    }

}