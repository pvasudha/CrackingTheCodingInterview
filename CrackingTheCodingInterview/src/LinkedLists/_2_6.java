package LinkedLists;

import java.util.Stack;

/**
 * Created by Pranav on 11/5/2017.
 */
public class _2_6 {
    public static void main(String args[]) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(2);
        Node d = new Node(5);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        Node n = a;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }

        System.out.println(palindrome(a));

    }

    static boolean palindrome(Node n) {
        //can't do this while sending a pointer to the end because it is singly linked
        Stack<Node> s = new Stack<Node>();
        Node p1 = n;
        Node p2 = n;
        int count = 0;
        while(p1 != null) {
            count++;
            s.push(p1);
            p1 = p1.next;
        }

        System.out.println("PEEK: " + s.peek().data);

        int index = 0;
        while(p2.next != null && index < count/2) {
            System.out.println("p2 " + p2.data + " s.pop() " + s.peek().data );
            if( p2.data != s.pop().data )
                return false;
            p2 = p2.next;
            index++;
        }
        return true;
    }
}
