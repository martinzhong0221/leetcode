package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	Arrays.sort(nums);
    	//two pointer solution
    	int j = 0;
    	int k = 0;
    	for(int i = 0; i<nums.length -2;i++) {
			if(i>0&&nums[i] == nums[i-1]) {
				continue;
			}
			int a = nums[i];
    		j = i+1;
    		k = nums.length-1;
    		while(j!=k) {
        		if(nums[j] + nums[k] == -a) {
        			List<Integer> list = Arrays.asList(a,nums[j],nums[k]);
        			result.add(list);
        			do{
        				j++;
        			}while(nums[j] == nums[j-1]&&j<k);
        		}else if(nums[j] + nums[k] >-a) {
        			do{
            			k--;
        			}while(nums[k] == nums[k+1]&&k>j);
        		}else {
        			do{
        				j++;
        			}while(nums[j] == nums[j-1]&&j<k);
        		}
    		}
    	}
    	return result;
    }
    public static void main(String[] args) {
		new Solution15().threeSum(new int[] {-1, 0, 1, 2, -1, -4});
	}
}
