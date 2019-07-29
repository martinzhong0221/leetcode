package leetcode.array;

/**
 *斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
给定 N，计算 F(N)。
 * @author Zhong Xiaoyu
 * 2019年7月6日
 */
public class Solution509 {
	   public int fib(int N) {
	        if(N==0){
	            return 0;
	        }
	        if(N==1){
	            return 1;
	        }
	        if(N==2){
	            return 1;
	        }
	        int n1=1 , n2=1, n3=0;
	        for(int i = 3; i<=N; i++){
	            n3 = n1+n2;
	            n1 = n2;
	            n2 = n3;
	        }
	        return  n3;
	    }
}
