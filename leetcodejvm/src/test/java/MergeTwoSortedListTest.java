import org.jetbrains.annotations.Nullable;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListTest {

    private int[] values1;
    private int[] values2;
    private MergeTwoSortedList.ListNode listNode1;
    private MergeTwoSortedList.ListNode listNode2;

    @Before
    public void setUp() throws Exception {
        values1 = new int[]{1, 2, 4};
        values2 = new int[]{};

        listNode1 = buildListNode(values1);
        listNode2 = buildListNode(values2);
    }

    @Nullable
    private static MergeTwoSortedList.ListNode buildListNode(int[] input) {
        MergeTwoSortedList.ListNode first = null;
        MergeTwoSortedList.ListNode last = null;
        MergeTwoSortedList.ListNode newNode;
        if (input.length <= 0) {
            return null;
        }
        for (int anInput : input) {
            newNode = new MergeTwoSortedList.ListNode(anInput);
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

    private static String generateListNodeString(MergeTwoSortedList.ListNode listNode) {
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
        MergeTwoSortedList.ListNode result = new MergeTwoSortedList().mergeTwoLists(listNode1,listNode2);
        System.out.println(generateListNodeString(result));
    }

}