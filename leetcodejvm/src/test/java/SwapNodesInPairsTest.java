import base.Node;
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
        Node node = NodeFactory.buildListNode(values);
        Node result = new SwapNodesInPairs().swapPairsRecu(node);
        System.out.println(NodeFactory.generateListNodeString(result));
    }

}