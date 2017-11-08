package LinkedLists;

import java.util.*;

/**
 * Created by Pranav on 11/5/2017.
 */
public class _2_1 {
    public static void main(String args[]) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;

        Node n = a;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }

        removeDups(a);
        n = a;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }
    static void removeDups (Node in) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node prev = null;
        while (in != null) {
            if(set.contains(in.data))
                prev.next = in.next;
            else {
                set.add(in.data);
                prev = in;
            }
            in = in.next;
        }
    }

    //to do this without using additional space
    static int removeDups2 (Node in, int k) {
        return 0;
    }
}
