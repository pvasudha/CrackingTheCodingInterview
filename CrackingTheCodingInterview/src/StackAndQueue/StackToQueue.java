package StackAndQueue;

import java.util.Stack;

/**
 * Created by Pranav on 11/6/2017.
 */
public class StackToQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private int front;

    public StackToQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    //This implementation has O(n) for queue and O(1) for dequeue
    void queue( int n ) {
        if(stack1.isEmpty())
            front = n;
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        stack1.push(n);
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
    }

    int dequeue() {
        return stack1.pop();
    }

    /*This implementation has O(1) for queue and AMORTIZED O(1) for dequeue
    This is because the worst case is when stack2 is empty then dequeue is O(n)
    When stack2 isn't empty dequeue is O(1) so on average the dequeue is O(1)
     */
    void queue2( int n ) {
        if(stack1.isEmpty() && stack2.isEmpty())
            front = n;
        stack1.push(n);
    }

    int dequeue2() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    int peek() {
        return front;
    }

}
