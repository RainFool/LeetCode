package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

    private MergeSort.Node dummy = new MergeSort.Node();
    private MergeSort.Node result;

    @Before
    public void setUp() throws Exception {
        int[] a = {12, 3, 4, 5, 88, 434, 44};

        MergeSort.Node current = dummy;
        for (int i = 0; i < a.length; i++) {
            current.next = new MergeSort.Node(a[i]);
            current = current.next;
        }
    }

    @Test
    public void sort() {
        result = new MergeSort().sort(dummy.next);

    }

    @After
    public void tearDown() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        MergeSort.Node cur = result;
        while (cur != null) {
            sb.append(cur.value);
            if (cur.next != null) {
                sb.append(",");
            } else {
                sb.append("]");
            }
            cur = cur.next;
        }
        System.out.println(sb.toString());
    }
}