package leetcode.slidingwindow;

import java.util.HashMap;

/**
   *    无重复字符的最长子串
 * @author Zhong Xiaoyu
 * 2019年6月14日
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
    	if(s == null || s.isEmpty()) {
    		return 0;
    	}
    	if(s.length() ==1) {
    		return 1;
    	}
        char[] chars = s.toCharArray();
        int result = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>(); 
        for(int end=0,start = 0;end<s.length();end++) {
        	char element = chars[end];
        	if(hashMap.containsKey(element)) {
        		start = Math.max(hashMap.get(element),start);
        	}
        	result = Math.max(end - start +1, result);
        	hashMap.put(element, end+1);

        }
    	return result;
    }
     public static void main(String[] args) {
		System.out.println(new Solution3().lengthOfLongestSubstring("sdafere53245gre54345dfgfg"));
	}
}
