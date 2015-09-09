package no225;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	private Queue<Integer> q = new LinkedList<Integer>();
	
    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        int n = q.size();
        while (n-- > 1)
            q.add(q.poll());
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return Arrays.toString(q.toArray());
    }
    
    
    public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.err.println(stack);
	}
}