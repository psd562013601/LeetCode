package no198;

public class Solution {
    public int rob(int[] num) {
        int len = num.length;
        assert(len>0);
        if (len == 1)
        	return num[0];
        else if (len ==2)
        	return Math.max(num[0], num[1]);
        else {
        	int m[] = new int[len];
        	m[0] = num[0];
        	m[1] = Math.max(num[0], num[1]);
        	for(int i = 2; i < len; i++) {
        		m[i] = Math.max(m[i-2]+num[i], m[i-1]);
        	}
        	int msum = Integer.MIN_VALUE;
        	for(int i = 0; i<len; i++) {
        		if(m[i]>msum)
        			msum = m[i];
        	}
        	return msum;
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
