package leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Solution225 {
	class MyStack {
		
		private Queue<Integer> input = new LinkedList<>();
		private Queue<Integer> output = new LinkedList<>();

	    /** Initialize your data structure here. */
	    public MyStack() {
	        
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	    	input.offer(x);
	    	while(!output.isEmpty()) {
	    		input.offer(output.remove());
	    	}
	    	Queue<Integer> temp = output;
	    	output = input;
	    	input = temp;
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        return output.remove();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        return output.element();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return output.isEmpty();
	    }
	}
}
