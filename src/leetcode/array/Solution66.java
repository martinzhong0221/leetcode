package leetcode.array;

import java.util.Arrays;

public class Solution66 {
    public int[] plusOne(int[] digits) {
    	//从低位开始+1，有进位则逐步进位
        for(int index =digits.length-1; index>=0;index--) {
        	digits[index] = digits[index] + 1;
        	if(digits[index] <10) {
        		break;
        	}else {
        		digits[index]= 0;
        	}
        	
        }
        //如是999这种数字，需要复制到长度+1的新数组里去。
        if(digits[0] == 0) {
        	int[] newDigits = new int[digits.length+1];
        	System.arraycopy(digits, 0, newDigits, 1, digits.length);
        	newDigits[0]=1;
        	return newDigits;
        }else {
            return digits;
        }
    }
    public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution66().plusOne(new int[]{9,9,9})));
	}
}
