import org.jetbrains.annotations.Nullable;
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

        listNode1 = buildListNode(values1);
        listNode2 = buildListNode(values2);
    }

    @Nullable
    private static ListNode buildListNode(int[] input) {
        ListNode first = null;
        ListNode last = null;
        ListNode newNode;
        if (input.length <= 0) {
            return null;
        }
        for (int anInput : input) {
            newNode = new ListNode(anInput);
            newNode.next = null;
            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }

        }
        return first;
    }

    private static String generateListNodeString(ListNode listNode) {
        if (listNode == null) {
            return "[null]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.append(listNode.val);
            stringBuilder.append(",");
            listNode = listNode.next;
        } while (listNode != null);
        return stringBuilder.toString();
    }

    @Test
    public void testMergeTwoLists() throws Exception {
        long start = System.currentTimeMillis();
        ListNode result = new MergeTwoSortedList().mergeTwoLists(listNode1, listNode2);
        long end = System.currentTimeMillis();
        String printData = generateListNodeString(result);
        System.out.println(printData);
        System.out.println("merge takes time :" + (end - start));
    }

}