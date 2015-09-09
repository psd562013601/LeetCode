package no136;

public class Solution {
    public int singleNumber(int[] A) {
        if (1==A.length)
        	return A[0];
        int x= A[0];
        for(int i = 1; i<A.length; i++) {
        	x ^= A[i];
        }
        return x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
