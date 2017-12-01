package LinkedLists;

/**
 * Created by Pranav on 11/5/2017.
 */
public class _2_4 {
    //need to understand task
    //should work but check over just in case

    public class LinkedList {
        Node head;
        void prepend(int val) {
            Node newHead = new Node(val);
            newHead.next = head;
            head = newHead;
        }
    }

    public Node head;

    void partition( Node in, int par ) {
        head = in;

        while(in != null) {
            if( in.data < par ) {
                prepend(in.data);
                if( in.next != null )
                    in.next = in.next.next;
                else
                    in.next = null;
            }
            in = in.next;
        }
    }
    void prepend(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }
}
