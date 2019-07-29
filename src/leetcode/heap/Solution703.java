package leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution703 {

	class KthLargest {

		private Queue<Integer> queue;
		private int k;
	    public KthLargest(int k, int[] nums) {
	        this.k = k;
	        queue = new PriorityQueue<Integer>(k);
	        for(int i: nums) {
	            add(i);
	        }
	    }
	    
	    public int add(int val) {
	        if(queue.size()<k) {
	        	queue.offer(val);
	        }else if(queue.peek()< val){
	        	queue.remove();
	        	queue.offer(val);
	        }
	        return queue.peek();
	    }
	}
	
	public static void main(String[] args) {
		new Solution703().new KthLargest(3,new int[]{4,5,8,2});
	}
}
