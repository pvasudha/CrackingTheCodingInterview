package LinkedLists;

/**
 * Created by Pranav on 11/5/2017.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null)
            n = n.next;
        n.next = end;
    }
}
