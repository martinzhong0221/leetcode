package leetcode.stack;

import java.util.Stack;

public class Solution232 {

	class MyQueue {

		private Stack<Integer> input = new Stack<Integer>();
		private Stack<Integer> output = new Stack<Integer>();
		
	    /** Initialize your data structure here. */
	    public MyQueue() {
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	    	input.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	    	this.removeInputToOutput();
	        return output.pop();
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	this.removeInputToOutput();
	        return output.peek();
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return input.isEmpty()&&output.isEmpty();
	    }
	    
	    private void removeInputToOutput() {
	        if(output.isEmpty()) {
	        	while(!input.isEmpty()) {
	        		output.push(input.pop());
	        	}
	        }
	    }
	}
}
