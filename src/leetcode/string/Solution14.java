package leetcode.string;

/**
 * 最长公共前缀
 * @author Zhong Xiaoyu
 * 2019年6月15日
 */
public class Solution14 {
	
    public String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length == 0) {
    		return "";
    	}
        if(1 == strs.length) {
        	return strs[0];
        }
        String longestStr = strs[0];
        int longestLength = 0;
        String currentStr;
    	for(int i=1;i<strs.length;i++) {
    		currentStr = strs[i];
    		longestLength = this.findLongestCommonPrefixLength(longestStr, currentStr);
    		if(longestLength == 0) {
    			break;
    		}else {
    			longestStr = longestStr.substring(0,longestLength);
    		}
    	}
    	return longestStr.substring(0, longestLength);
    }
    
    private int findLongestCommonPrefixLength(String a,String b) {
    	int length = Math.min(a.length(), b.length());
    	int commonMaxLength = 0;
    	for(int i = 0;i<length;i++) {
    		if(a.charAt(i) == b.charAt(i)) {
    			commonMaxLength++;
    		}else {
    			break;
    		}
    	}
    	return commonMaxLength;
    }

    public static void main(String[] args) {
		System.out.println(new Solution14().longestCommonPrefix(new String[]{"dog","racecar","car"}));
	}
}
