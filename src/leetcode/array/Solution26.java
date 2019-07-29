package leetcode.array;

import java.util.Arrays;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
    	int index=0;
        for(int i=0,end=nums.length-1; i<end;i++) {
        	if(nums[i]!=nums[i+1]) {
        		index ++;
        		if(index<end) {
            		nums[index]=nums[i+1];
        		}
        	}
        }
        return index+1;
    }
    public static void main(String[] args) {
    	int[] arr= new int[]{0,0,1,1,1,2,2,3,3,4};
		int limit = new Solution26().removeDuplicates(arr);
		Arrays.stream(arr).limit(limit).forEach(element->System.out.println(element));
	}
}
