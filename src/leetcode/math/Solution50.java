package leetcode.math;

public class Solution50 {
    public double myPow(double x, int n) {
        double result = 1d;
        for(int i = n;i!=0 ;i/=2){
            if(i%2!=0){
                result *=x;
            }
            x *=x;
        }
        return n<0?1/result:result;
    }
    
    public static void main(String[] args) {
		new Solution50().myPow(2, 12);
	}
}
