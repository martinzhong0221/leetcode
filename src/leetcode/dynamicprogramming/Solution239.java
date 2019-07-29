package leetcode.dynamicprogramming;

import java.util.Deque;
import java.util.LinkedList;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums == null || nums.length == 0) {
    		return new int[0];
    	}
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length-k+1];
        int n = 0;
        //init deque
        for(int i=0;i<nums.length;i++) {
            deque.offerFirst(nums[i]);
            //window length > k, remove last one.
        	if(deque.size()>k) {
        		deque.removeLast();
        	}
        	//keep the last one is the largest one
        	while(deque.peekFirst()<nums[i]){
        		deque.removeFirst();
        	}
        	//from index k-1, put the largest one into the array
        	if(i>=k-1) {
        		result[n] = deque.peekLast();
        		n++;
        	}
        }
        return result;
    }
    public static void main(String[] args) {
		new Solution239().maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);
	}
}
