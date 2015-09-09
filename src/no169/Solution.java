package no169;

import java.util.Stack;

public class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
			if(stack.isEmpty())
				stack.push(nums[i]);
			else {
				if(nums[i] == stack.peek())
					stack.push(nums[i]);
				else 
					stack.pop();
			}
		}
        return stack.peek();
    }
}