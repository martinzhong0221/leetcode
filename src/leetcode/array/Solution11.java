package leetcode.array;

/**
 * 盛最多水的容器
 * @author Zhong Xiaoyu
 * 2019年6月18日
 */
public class Solution11 {
    public int maxArea(int[] height) {
    	int currentMax = 0;
    	int finalMax = 0;
        for(int i=0;i<height.length;i++) {
        	for(int j=1;j<height.length;j++) {
        		currentMax = Math.min(height[i], height[j]) * (j-i);
        		if(currentMax>finalMax) {
        			finalMax = currentMax;
        		}
        	}
        }
    	return finalMax;
    }
    public static void main(String[] args) {
		System.out.println(new Solution11().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
	}
}
