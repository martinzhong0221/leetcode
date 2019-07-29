package leetcode.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 有效括号
 * @author Zhong Xiaoyu
 * 2019年6月15日
 */
public class Solution20 {
	
    public boolean isValid(String s) {
    	char[] chars = s.toCharArray();
    	List<Character> list = new ArrayList<>();
    	for(char c: chars) {
    		if(list.isEmpty()) {
    			list.add(c);
    		}else {
    			if(this.isMatched(list.get(list.size()-1), c)) {
    				list.remove(list.size()-1);
    			}else {
    				list.add(c);
    			}
    		}
    	}
    	return list.isEmpty();
    }
    
    private boolean isMatched(char left ,char right){
       return left=='(' && right==')'
    		||left=='{' && right=='}'	
    		||left=='[' && right==']';

    }
    public static void main(String[] args) {
		System.out.println(new Solution20().isValid("([)]"));
	}
}
