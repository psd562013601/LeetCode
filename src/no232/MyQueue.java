package no232;

import java.util.Stack;

public class MyQueue {
	private Stack<Integer> s = new Stack<>();
	
	
    // Push element x to the back of queue.
    public void push(int x) {
    	s.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> tmp = new Stack<>();
        while(!s.empty()) {
        	tmp.push(s.pop());
        }
        tmp.pop();
        s.clear();
        while(!tmp.empty()) {
        	s.push(tmp.pop());
        }
    }

    // Get the front element.
    public int peek() {
        Stack<Integer> tmp = new Stack<>();
        while(!s.empty()) {
        	tmp.push(s.pop());
        }
        int ret = tmp.peek();
        s.clear();
        while(!tmp.empty()) {
        	s.push(tmp.pop());
        }
        return ret;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s.empty();
    }
}