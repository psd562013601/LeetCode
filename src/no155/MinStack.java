package no155;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> min = new Stack<>();

	public void push(int x) {
		stack.push(x);
		if (min.isEmpty())
			min.push(x);
		else {
			int tmp = min.peek();
			if (x < tmp)
				min.push(x);
			else
				min.push(tmp);
		}
	}

	public void pop() {
		stack.pop();
		min.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min.peek();
	}

}
