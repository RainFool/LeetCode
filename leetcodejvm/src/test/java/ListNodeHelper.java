import org.jetbrains.annotations.Nullable;

public class ListNodeHelper {
    @Nullable
    public static ListNode buildListNode(int[] input) {
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

    public static String generateListNodeString(ListNode listNode) {
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
}
