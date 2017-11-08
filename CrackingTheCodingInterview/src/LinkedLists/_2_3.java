package LinkedLists;

/**
 * Created by Pranav on 11/5/2017.
 */
public class _2_3 {
    boolean deleteMiddleNode(Node n) { //passed in node that should be deleted
        if(n == null || n.next == null)
            return false;

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;

        return true;
    }
}
