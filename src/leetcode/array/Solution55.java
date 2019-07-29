package leetcode.array;

/**
 *给定一个非负整数数组，你最初位于数组的第一个位置。
数组中的每个元素代表你在该位置可以跳跃的最大长度。
判断你是否能够到达最后一个位置。
 * @author Zhong Xiaoyu
 * 2019年7月16日
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
    	if(nums == null || nums.length == 0) {
    		return false;
    	}
    	if(nums.length == 1) {
    		return true;
    	}
    	int jumpIndex = nums.length-1;
    	int pointer = nums.length-2;
    	boolean jumped = false;
    	while(pointer == 0) {
    		if(nums[pointer] == jumpIndex - pointer) {
    			jumpIndex = pointer;
    			jumped = true;
    		}
    		pointer --;
    	}
    	return jumped;
    }
}
