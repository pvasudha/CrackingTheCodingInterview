package LinkedLists;

public class _2_2 {
    static void returnKthLast (Node in, int k) {
        Node a = in;
        Node b = in;
        for( int c = 0; c < k; c++ ) {
            if(a == null) return;
            a = a.next;
        }
        while(a.next != null) {
            a = a.next;
            b = b.next;
        }
        System.out.println(b.data);
    }
}
