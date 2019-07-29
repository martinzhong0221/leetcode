package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 *给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

示例 1:

输入: s = "anagram", t = "nagaram"
输出: true


示例 2:

输入: s = "rat", t = "car"
输出: false

说明:
你可以假设字符串只包含小写字母。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-anagram
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Zhong Xiaoyu
 * 2019年7月10日
 */
public class Solution242 {

    public boolean isAnagram(String s, String t) {
    	char[] sChars = s.toCharArray();
    	char[] tChars = t.toCharArray();
    	Map<Character,Integer> map = new HashMap<>(Math.max(s.length(), t.length()));
    	
    	//将s中的字符出现次数计数
    	Integer value = null;
    	for(char c:sChars) {
    		value = map.get(c);
    		if(value == null) {
    			map.put(c, 1);
    		}else {
    			map.put(c, value+1);
    		}
    	}
    	//将t中的字符出现次数在原map中扣减
    	for(char c:tChars) {
    		value = map.get(c);
    		if(value == null) {
    			return false;
    		}else {
    			value --;
    			if(value <0) {
    				return false;
    			}else {
    				map.put(c, value);
    			}
    		}
    	}
    	//所有字符的计数全部为0，则一模一样
    	for(Integer i:map.values()) {
    		if(i!=0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public boolean isAnagram1(String s, String t) {
    	char[] sChars = s.toCharArray();
    	char[] tChars = t.toCharArray();
    	int[] alphabetChars = new int[26];
    
    	int index = 0;
    	for(char c:sChars) {
    		index = c-97;
    		alphabetChars[index] = alphabetChars[index]+1;
    	}
    	for(char c:tChars) {
    		index = c-97;
    		alphabetChars[index] = alphabetChars[index]-1;
    	}
    	for(int value:alphabetChars) {
    		if(value!=0) {
    			return false;
    		}
    	}
		return true;
    }
      public static void main(String[] args) {
    	int a = 'a';
		System.out.println(a);
	}
}
