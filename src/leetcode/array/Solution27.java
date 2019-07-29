package leetcode.array;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
    	int len = nums.length;
        for(int i=0,j=nums.length;i<j;i++) {
    		while(nums[i]==val&&i!=j){
        		nums[i] = nums[i]+nums[j-1];
        		nums[j-1] = nums[i]-nums[j-1];
        		nums[i] = nums[i]- nums[j-1];
        		len--;
        		j--;
    		}
        }
        return len;
    }
    public static void main(String[] args) {
		System.out.println(new Solution27().removeElement(new int[]{4,4,0,1,0,2}, 0));
	}
}
