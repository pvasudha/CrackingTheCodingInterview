package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Pranav on 11/6/2017.
 */
public class QueueToStack {
    //O(n) Push and O(1) Pop, optimized to one queue from using an aux queue to do the same thing
    private Queue<Integer> q;

    public QueueToStack() {
        q = new LinkedList<Integer>();
    }

    void push( int n ) {
        q.add(n);
        for (int i = 0; i < q.size() - 1; i++ )
            q.add(q.remove());
    }

    int pop () {
        return q.remove();
    }

}
