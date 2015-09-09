package no162;

/**
 * Find Peak Element
 * @author psd
 *
 */
public class Solution {
    public int findPeakElement(int[] num) {
        int n = num.length;
        int minInt = Integer.MIN_VALUE;
        if (n==1)
        	return 0;
        boolean f1 = num[0] > minInt;
        for(int i = 1; i<n; i++) {
        	if(num[i] < num[i-1])
        		return i-1;
        }
        return n-1;
    }
    
	public static void main(String[] args) {

	}

}
