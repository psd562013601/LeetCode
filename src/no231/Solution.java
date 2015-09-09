package no231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(0==n)
        	return false;

        return ((n ^ (n-1))+1) == n<<1;
    }
    
    
    public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfTwo(0));
	}
}