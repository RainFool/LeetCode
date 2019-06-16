import base.Node;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListTest {

    private int[] values1;
    private int[] values2;
    private Node node1;
    private Node node2;

    @Before
    public void setUp() throws Exception {
        values1 = new int[]{1, 2, 4};
        values2 = new int[]{1, 3, 5, 6};

        node1 = NodeFactory.buildListNode(values1);
        node2 = NodeFactory.buildListNode(values2);
    }

    @Test
    public void testMergeTwoLists() throws Exception {
        long start = System.currentTimeMillis();
        Node result = new MergeTwoSortedList().mergeTwoLists(node1, node2);
        long end = System.currentTimeMillis();
        String printData = NodeFactory.generateListNodeString(result);
        System.out.println(printData);
        System.out.println("merge takes time :" + (end - start));
    }

}