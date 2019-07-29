package leetcode.array;

public class Solution {
    /**是否回文数
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x<0) {
        	return false;
        }
        if(x<10) {
        	return true;
        }
        long temp = x ;
        long tens = 1;
        long currentNumber = 0;
        long lastNumber = 0;
        long y = 0;
        while(temp>0) {
        	//10累乘
        	tens=tens*10;
        	//依次获取 个 十 百 千 万 位上的数字
        	currentNumber = temp%tens/(tens/10);
        	//获取要减去的数，如1989，每次获取，9，89，989等等
        	lastNumber = lastNumber + (currentNumber *tens /10);
        	//将已经获取的低位数都减掉，如1989，每次变为1980，1900，1000
        	temp = temp - (currentNumber *tens /10);
        	//组装回文数，如1989 ，每次为 9，98，989，9891
        	y = y*10 + currentNumber;

        };
        return x == y;
    }

    public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(1000000001));
	}
}
