import base.Node;
import org.jetbrains.annotations.Nullable;

public class NodeFactory {
    @Nullable
    public static Node buildListNode(int[] input) {
        Node first = null;
        Node last = null;
        Node newNode;
        if (input.length <= 0) {
            return null;
        }
        for (int anInput : input) {
            newNode = new Node(anInput);
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

    public static String generateListNodeString(Node node) {
        if (node == null) {
            return "[null]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.append(node.val);
            stringBuilder.append(",");
            node = node.next;
        } while (node != null);
        return stringBuilder.toString();
    }
}
